package org.fmgroup.mediator.plugins.generators.Run;

import org.fmgroup.mediator.language.entity.Entity;
import org.fmgroup.mediator.language.statement.Statement;
import org.fmgroup.mediator.language.term.Term;
import org.fmgroup.mediator.language.type.Type;

public class RunException extends Exception{

    public RunException(String msg) {
        super(msg);
    }

    public static RunException UnhandledType(Type t) {
        RunException ex = new RunException(
                t.toString()
        );
        return ex;
    }

    public static RunException UnhandledTerm(Term t) {
        RunException ex = new RunException(
                t.toString() + " : " + t.getClass().toString()
        );
        return ex;
    }

    public static RunException UnhandledStatement(Statement t) {
        RunException ex = new RunException(
                t.toString() + " : " + t.getClass().toString()
        );
        return ex;
    }

    public static RunException UnclosedEntity(Entity entity) {
        RunException ex = new RunException(
                String.format(
                        "Entity %s is not closed.",
                        entity.getName()
                )
        );
        return ex;
    }

    public static RunException InconsistentPinType(int pinIndex) {
        RunException ex = new RunException(
                String.format(
                        "directions of pin %d are inconsistent.",
                        pinIndex
                )
        );
        return ex;
    }
}
