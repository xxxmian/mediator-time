package org.fmgroup.mediator.plugins.generators.Run;

import org.fmgroup.mediator.language.Program;
import org.fmgroup.mediator.language.RawElement;
import org.fmgroup.mediator.language.ValidationException;
import org.fmgroup.mediator.language.entity.Entity;
import org.fmgroup.mediator.language.entity.automaton.Automaton;
import org.fmgroup.mediator.language.entity.automaton.Transition;
import org.fmgroup.mediator.language.entity.automaton.TransitionGroup;
import org.fmgroup.mediator.language.entity.automaton.TransitionSingle;
import org.fmgroup.mediator.language.entity.system.System;
import org.fmgroup.mediator.language.scope.Declaration;
import org.fmgroup.mediator.language.scope.TypeDeclaration;
import org.fmgroup.mediator.language.scope.VariableDeclaration;
import org.fmgroup.mediator.language.statement.*;
import org.fmgroup.mediator.language.term.*;
import org.fmgroup.mediator.language.type.Type;
import org.fmgroup.mediator.language.type.termType.*;
import org.fmgroup.mediator.plugin.generator.FileSet;
import org.fmgroup.mediator.plugin.generator.Generator;
import org.fmgroup.mediator.plugins.generators.Run.RunException;
import org.fmgroup.mediator.plugins.scheduler.runScheduler;
import java.util.Scanner;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

enum RunPinDirection {
    IN,
    OUT
}


public class Run implements Generator {
    private Map<Integer, RunPinDirection> pinStatus = new HashMap<>();

    public String entityGenerate(Entity elem) throws RunException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        pinStatus = new HashMap<>();
        //java.lang.System.out.println(elem.toString());
        if (elem instanceof Automaton) {
            try {

                return automatonGenerate((Automaton) elem,typedefGenerate((Program) elem.getParent()));

            } catch (ValidationException e) {
                e.printStackTrace();
            }
        } else if (elem instanceof System) {
            try {
                String context = entityGenerate(runScheduler.Schedule((System) elem));
                File file =new File("temp1.java");
                file.mkdirs();

                try {

                        FileWriter fileWritter = new FileWriter(file.getName(),false);
                        fileWritter.write(context);
                        fileWritter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                }


                JavaCompiler javac = ToolProvider.getSystemJavaCompiler();
                int status = javac.run(null, null, null, "-d", java.lang.System.getProperty("user.dir"),"temp1.java");
                if(status!=0){
                    java.lang.System.out.println("Compiled failed！");
                }
                java.lang.System.out.println("Compiled successfully！");

                Class clz = Class.forName("org.fmgroup.mediator.temp2");//返回与带有给定字符串名的类 或接口相关联的 Class 对象。
                Object o = clz.newInstance();

                Method method = clz.getDeclaredMethod("output",int.class);
                while(true){
                    java.lang.System.out.println("Please enter the number of simulation steps：\n");
                    Scanner sc = new Scanner(java.lang.System.in);
                    int __step = sc.nextInt();
                    if ( __step == 0){
                        break;
                    }
                    method.invoke(o,__step);
                }

                return "finish";//String.valueOf(runScheduler.Schedule((System) elem))+"\n"+

            } catch (ValidationException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public FileSet generate(RawElement elem) throws RunException {
        // todo put dependencies
        FileSet files = new FileSet();
        if (elem instanceof Entity) {
            try {
                files.add(((Entity) elem).getName() + ".java", entityGenerate((Entity) elem));

            } catch (FileAlreadyExistsException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            return files;
        } else {
            throw new RunException(String.format(
                    "unsupport language element %s",
                    elem.getClass().getName()
            ));
        }
    }

    @Override
    public String getSupportedPlatform() {
        return "Run";
    }


    private Map<String,Type> typedefGenerate(Program p) throws RunException {
        HashMap<String,Type> typedef = new HashMap();
        if(((List) (p.getTypedefs().getDeclarationList())).isEmpty()){
        return null;}
        // TODO only CommandGenerate typedefs used
        for (Declaration typedecl : p.getTypedefs().getDeclarationList()) {

            List<String> aliases = typedecl.getIdentifiers();

            Type rawname = ((TypeDeclaration) typedecl).getType();
            assert typedecl instanceof TypeDeclaration;
            for (String alias :aliases){
                typedef.put(alias, rawname);
            }
        }

        return typedef;
    }
    //We layered the transition and when we meet an iteStatement we go to the next level, the maxlayer tells us that the maximum number of the level
    private int maxlayer = 0;
    //The transitionmark treats an iteStatement as a transition
    private int transitionmark = 0;
    private String globalDeclarations = "";
    private ArrayList<String> variables = new ArrayList<>();
    private String automatonGenerate(Automaton a, Map<String, Type> b) throws RunException, ValidationException {

        if (a.getEntityInterface().getDeclarationList().size() > 0) {
            throw RunException.UnclosedEntity(a);
        }

        String module =
                "package org.fmgroup.mediator;\n"+
                "import java.util.Random;\n"+
                "public class temp1 {" + " "+"\n";
        String prog = "";
        for (Declaration var : a.getLocalVars().getDeclarationList()) {

            assert var instanceof VariableDeclaration;

            Type newtype = null;

            if(!(b==null)){

                if (b.containsKey(((VariableDeclaration) var).getType().toString())){
                    newtype = b.get(((VariableDeclaration) var).getType().toString());
                }else{
                    newtype = ((VariableDeclaration) var).getType();
                }
            }else{
                newtype = ((VariableDeclaration) var).getType();
            }
            String strType = typeGenerate(newtype);

            for (String name : var.getIdentifiers()) {

                switch (strType){
                    case "init":
                        Type inibasetype = ((InitType) newtype).getBaseType();

                        String basestrtype = typeGenerate(inibasetype);
                        switch (basestrtype){
                            case "int":
                                globalDeclarations += (typeGenerate(inibasetype)+ " " + name + " = " + "" + ((InitType)(newtype)).getInitValue()+ ";\n");
                                variables.add(name);
                                break;
                            case "[%s..%s]":
                                globalDeclarations += ("int" + " " + name + " = " + "" + ((InitType)(newtype)).getInitValue()+ ";\n");
                                variables.add(name);
                                break;
                            case "bool":
                                globalDeclarations += ("Boolean"+ " " + name + " = " + "" + ((InitType)(newtype)).getInitValue()+ ";\n");
                                variables.add(name);
                                break;
                        }
                        break;
                    case "int":
                        globalDeclarations += (strType + " " + name + ";\n");
                        variables.add(name);
                        break;
                    case "clock":
                        globalDeclarations += ("long " + name +" = "+ "System.currentTimeMillis()" +";\n");
                        variables.add(name);
                        break;
                    case "counter":
                        globalDeclarations += ("int " + name + " = " + "0"+";\n");
                        variables.add(name);
                        break;
                    case "[%s..%s]":
                        globalDeclarations += ( "int " + name + ";\n");
                        variables.add(name);
                        break;
                    case "bool":
                        globalDeclarations += ("Boolean" + " " + name + " = false;\n");
                        variables.add(name);
                        break;
                    case "enum":

                        String bigname = name.toUpperCase();

                        globalDeclarations +=("enum " + bigname + " {");
                        for(String item : ((EnumType)(newtype)).getItems()){
                            globalDeclarations +=(item+", ");
                        }
                        globalDeclarations += "nul }\n";
                        globalDeclarations += bigname+" "+name+";\n";
                        variables.add(name);
                        break;
                    case "list":
                        Type basetype = ((ListType)(newtype)).getBaseType();
                        Term key = ((ListType)(newtype)).getCapacity();
                        globalDeclarations +=(basetype + "[] " + name+ " = new "+basetype+"["+key+"];\n");
                        variables.add(name);
                        break;

                }

            }
        }
        globalDeclarations +=("int pmark = 0;\n");
        globalDeclarations +=("int c_dist_value;\n");
        // we assume that the automaton has been canonicalized already
        assert a.getTransitions().size() == 1;
        assert a.getTransitions().get(0) instanceof TransitionGroup;
        String decide = "";
        String transitionExecution = "";
        int pmark = 0;
        for (Transition t : ((TransitionGroup) a.getTransitions().get(0)).getTransitions()) {
            assert t instanceof TransitionSingle;
            String guard  = termGenerate(((TransitionSingle) t).getGuard(), 0,b);
            decide += "("+((guard.replace(" ="," ==")).replace("|","||")).replace("&","&&")+")||";
            List<Statement> statements = ((TransitionSingle) t).getStatements();
            transitionExecution += transitionGenerate(guard, pmark,statements);
            pmark += 1;
        }
        decide = decide.substring(0,decide.length() - 2);
        String _print = "";
        for (String i:variables){
            _print += "if (((Object) "+i+" instanceof Integer)||((Object) "+ i +" instanceof Boolean)) {\n"+
            "System.out.print(\""+i+": \");\n"+
            "System.out.println("+i+");\n"+
            "}\n";

        }
        String simulate =

                "public void output(int step){\n" +
                        "int _step = 0;\n"+
                         "while(_step < step){\n"+
                        "if (!("+decide+"))"+" {\n"+
                        "System.out.println(\"deadlock!\");\n"+
                        "break;}\n"+
                        "Random r = new Random();\n"+
                        "pmark = r.nextInt("+String.valueOf(pmark)+");\n"+
                        transitionExecution+
                        "}\n"+
                        _print+
                "}\n";

        String endmodule = "}";

        prog = module + globalDeclarations + simulate + endmodule;

        return prog;
    }


    //oldguard: the previous level's guard
    // newguard:the condition of the IteStatement which written in virtual variables
    //markguard: the label guard of the IteStatement in the previous level
    //statements: the statements of the IteStatement
    //previousmark: the label of the IteStatement in the previous level
    //layer: the level of the current transition
    //Else: if the transition is based on Elsestmt
    private String transitionGenerate( String guard,int pmark,List<Statement> statements) throws RunException, ValidationException {
        String transition = "";
        String pguard = "pmark = "+String.valueOf(pmark);
        String _guard ="("+"("+ pguard +")"+"&"+"(" + guard+")"+")";
        String _statement = "";
        for (Statement i:statements){
            //java.lang.System.out.println(i+"     end");
            if (i instanceof AssignmentStatement){
                if (((AssignmentStatement) i).getTarget() == null) {
                    _statement += termGenerate(((AssignmentStatement) i).getExpr(),0,null) + ";";
                } else {
                    _statement += termGenerate(((AssignmentStatement) i).getTarget(), 0,null) +
                            " = " +
                            termGenerate(((AssignmentStatement) i).getExpr(), 0,null) + ";\n";
                    }
                }
            else if (i instanceof ResetStatement){
                _statement += ((ResetStatement) i).getResetValue().toString()+" = "+"System.currentTimeMillis()"+";\n";
            }
            else if (i instanceof IncreaseStatement){
                _statement += ((IncreaseStatement) i).getIncreaseValue().toString()+" ++ "+";\n";
            }

        else
            _statement += (String.valueOf(i)+"\n");
        }
        transition += "if "+((_guard.replace(" ="," ==")).replace("|","||")).replace("&","&&")  +"{"+_statement+
                "_step += 1;\n"+
                "}\n";
        return transition;
    }
    private String typeGenerate(Type t) throws RunException {
        if ( t instanceof IntType) {
            return "int";
        }
        if (t instanceof BoundedIntType){
            return "[%s..%s]";
        }
        if (t instanceof InitType) return "init";

        if (t instanceof DoubleType) return "double";

        if (t instanceof BoolType) return "bool";

        if (t instanceof EnumType) return "enum";

        if (t instanceof NullType) return "null";

        if (t instanceof ListType) return "list";

        if (t instanceof ClockType) return "clock";

        if (t instanceof CounterType) return "counter";


        throw RunException.UnhandledType(t);
    }

    private String select(String s) throws RunException{
        switch (s){
            case "==":
                return "=";
            case "&&":
                return "&";
            case "||":
                return "|";
            default:
                return s;
        }
    }

    private String virtualtermGenerate(Term t, int parentPrecedence,String pre, Map<String,Type> b) throws RunException, ValidationException {
        if (t instanceof IntValue) return String.valueOf(((IntValue) t).getValue());
        if (t instanceof NullValue) return "NULL";
        if (t instanceof BoolValue) return ((BoolValue) t).getValue() ? "true" : "false";
        if (t instanceof IdValue) {
            return pre+((IdValue) t).getIdentifier();
        }
        if (t instanceof DoubleValue) {
            return String.valueOf(((DoubleValue) t).getValue());
        }


        if (t instanceof BinaryOperatorTerm) {
            // TODO : brackets
            String binary = "";
            String s = ((BinaryOperatorTerm) t).getOpr().toString();
            String left = virtualtermGenerate(((BinaryOperatorTerm) t).getLeft(), t.getPrecedence(), pre,b);
            String right = virtualtermGenerate(((BinaryOperatorTerm) t).getRight(), t.getPrecedence(), pre,b);
            if((s == "^")||(s == "^^")){
                binary += ("("+left+" & "+"!"+right+")"+"|"+"("+"!"+left+"&"+right+")");
                return binary;
            }else{
                return String.format("%s %s %s", left, select(s), right);
            }
        }
        if (t instanceof FieldTerm) {
            return String.format(
                    "%s.%s",
                    termGenerate(((FieldTerm) t).getOwner(), t.getPrecedence(),b), ((FieldTerm) t).getField()
            );
        }
        if (t instanceof CallTerm) {
            List<String> args = new ArrayList<>();
            for (Term arg : ((CallTerm) t).getArgs()) {
                args.add(termGenerate(arg, 0,b));
            }

            // todo check whether it is a pwm port

            String calleeName = ((CallTerm) t).getCallee().toString();
            Integer pin = null;
            RunPinDirection pinDirection = null;

            if (calleeName.equals("digitalWrite") || calleeName.equals("analogWrite")) {
                pin = Integer.parseInt(((CallTerm) t).getArg(0).toString());
                pinDirection = RunPinDirection.OUT;
            } else if (calleeName.equals("digitalRead") || calleeName.equals("analogRead")) {
                pin = Integer.parseInt(((CallTerm) t).getArg(0).toString());
                pinDirection = RunPinDirection.IN;
            }

            if (pin != null) {
                if (pinStatus.containsKey(pin) && !pinStatus.get(pin).equals(pinDirection)) {
                    throw RunException.InconsistentPinType(pin);
                }

                pinStatus.put(pin, pinDirection);
            }

            return String.format(
                    "%s(%s)",
                    ((CallTerm) t).getCallee().toString(),
                    String.join(", ", args)
            );
        }

        if (t instanceof SingleOperatorTerm) {
            return ((SingleOperatorTerm) t).getOpr() + virtualtermGenerate(((SingleOperatorTerm) t).getTerm(), t.getPrecedence(),pre,b);
        }
        if (t instanceof ElementTerm) {
            return String.format(
                    "%s%s",
                    virtualtermGenerate(((ElementTerm) t).getContainer(), t.getPrecedence(),pre,b),
                    virtualtermGenerate(((ElementTerm) t).getKey(), 0,pre,b)
            );
        }

        if (t instanceof EnumValue) return pre+t.toString();



        if (b.containsKey(t.getType().toString())){
            Type rawType = b.get(t.getType().toString());
            if (rawType instanceof IntValue) return String.valueOf(((IntValue) t).getValue());
            if (rawType instanceof NullValue) return "NULL";
            if (rawType instanceof BoolValue) return ((BoolValue) t).getValue() ? "true" : "false";
            if (rawType instanceof IdValue) {
                return pre+((IdValue) t).getIdentifier();
            }
            if (rawType instanceof DoubleValue) {
                return String.valueOf(((DoubleValue) t).getValue());
            }
            if (rawType instanceof ElementTerm) {
                return String.format(
                        "%s%s",
                        virtualtermGenerate(((ElementTerm) t).getContainer(), t.getPrecedence(),pre,b),
                        virtualtermGenerate(((ElementTerm) t).getKey(), 0,pre,b)
                );
            }

            if (rawType instanceof EnumValue) return "v"+t.toString();
        }



        throw RunException.UnhandledTerm(t);
    }

    private String termGenerate(Term t, int parentPrecedence,Map<String,Type> b) throws RunException, ValidationException {


        if (t instanceof IntValue) return String.valueOf(((IntValue) t).getValue());
        if (t instanceof ClockValue) return String.valueOf(((ClockValue) t).getValue());
        if (t instanceof CounterValue) return String.valueOf(((CounterValue) t).getValue());
        if (t instanceof NullValue) return "NULL";
        if (t instanceof BoolValue) return ((BoolValue) t).getValue() ? "true" : "false";
        if (t instanceof IdValue) {
            return ((IdValue) t).getIdentifier();
        }
        if (t instanceof DoubleValue) {
            return String.valueOf(((DoubleValue) t).getValue());
        }


        if (t instanceof BinaryOperatorTerm) {
            // TODO : brackets
            String binary = "";
            String s = ((BinaryOperatorTerm) t).getOpr().toString();
            String left = termGenerate(((BinaryOperatorTerm) t).getLeft(), t.getPrecedence(),b);
            String right = termGenerate(((BinaryOperatorTerm) t).getRight(), t.getPrecedence(),b);
            if((s == "^")||(s == "^^")){
                binary += ("("+left+" & "+"!"+right+")"+"|"+"("+"!"+left+"&"+right+")");
                return binary;
            }else{
                return String.format("%s %s %s", left, select(s), right);
            }
        }
        if (t instanceof FieldTerm) {
            return String.format(
                    "%s.%s",
                    termGenerate(((FieldTerm) t).getOwner(), t.getPrecedence(),b), ((FieldTerm) t).getField()
            );
        }
        if (t instanceof CallTerm) {
            List<String> args = new ArrayList<>();
            for (Term arg : ((CallTerm) t).getArgs()) {
                args.add(termGenerate(arg, 0,b));
            }

            // todo check whether it is a pwm port

            String calleeName = ((CallTerm) t).getCallee().toString();
            Integer pin = null;
            RunPinDirection pinDirection = null;

            if (calleeName.equals("digitalWrite") || calleeName.equals("analogWrite")) {
                pin = Integer.parseInt(((CallTerm) t).getArg(0).toString());
                pinDirection = RunPinDirection.OUT;
            } else if (calleeName.equals("digitalRead") || calleeName.equals("analogRead")) {
                pin = Integer.parseInt(((CallTerm) t).getArg(0).toString());
                pinDirection = RunPinDirection.IN;
            }

            if (pin != null) {
                if (pinStatus.containsKey(pin) && !pinStatus.get(pin).equals(pinDirection)) {
                    throw RunException.InconsistentPinType(pin);
                }

                pinStatus.put(pin, pinDirection);
            }

            return String.format(
                    "%s(%s)",
                    ((CallTerm) t).getCallee().toString(),
                    String.join(", ", args)
            );
        }

        if (t instanceof SingleOperatorTerm) {
            return ((SingleOperatorTerm) t).getOpr() + "("+termGenerate(((SingleOperatorTerm) t).getTerm(), t.getPrecedence(),b)+")";
        }
        if (t instanceof ElementTerm) {
            return String.format(
                    "%s%s",
                    termGenerate(((ElementTerm) t).getContainer(), t.getPrecedence(),b),
                    termGenerate(((ElementTerm) t).getKey(), 0,b)
            );
        }

        if (t instanceof EnumValue)
        {
            return t.toString();
        }





        if (b.containsKey(t.getType().toString())){
            Type rawType = b.get(t.getType().toString());
            if (rawType instanceof IntValue) return String.valueOf(((IntValue) t).getValue());
            if (rawType instanceof ClockValue) return String.valueOf(((ClockValue) t).getValue());
            if (rawType instanceof CounterValue) return String.valueOf(((CounterValue) t).getValue());
            if (rawType instanceof NullValue) return "NULL";
            if (rawType instanceof BoolValue) return ((BoolValue) t).getValue() ? "true" : "false";
            if (rawType instanceof IdValue) {
                return ((IdValue) t).getIdentifier();
            }
            if (rawType instanceof DoubleValue) {
                return String.valueOf(((DoubleValue) t).getValue());
            }
            if (rawType instanceof ElementTerm) {
                return String.format(
                        "%s%s",
                        termGenerate(((ElementTerm) t).getContainer(), t.getPrecedence(),b),
                        termGenerate(((ElementTerm) t).getKey(), 0,b)
                );
            }

            if (rawType instanceof EnumValue) return t.toString();
        }
        throw RunException.UnhandledTerm(t);
    }



    @Override
    public String getName() {
        return "Run code generator";
    }

    @Override
    public String getVersion() {
        return "0.0.1";
    }

    @Override
    public String getDescription() {
        return "providing support for Run code generation";
    }

    @Override
    public List<String> requiredLibraries() {
        List<String> libs = new ArrayList<>();
        libs.add("Run");
        return libs;
    }
}
