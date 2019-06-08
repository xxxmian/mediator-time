package org.fmgroup.mediator.language.statement;

import org.antlr.v4.runtime.ParserRuleContext;
import org.fmgroup.mediator.language.RawElement;
import org.fmgroup.mediator.language.ValidationException;
import org.fmgroup.mediator.language.generated.MediatorLangParser;
import org.fmgroup.mediator.language.term.NullValue;
import org.fmgroup.mediator.language.term.Term;
import org.fmgroup.mediator.language.type.Type;

import java.util.Map;

public class ContinueStatement implements Statement {

    private RawElement parent;
    private Term continueValue;

    public Term getContinueValue() {
        return continueValue;
    }

    public ContinueStatement setContinueValue(Term ContinueValue) {
        this.continueValue = continueValue;
        continueValue.setParent(this);
        return this;
    }

    @Override
    public ContinueStatement fromContext(ParserRuleContext context, RawElement parent) throws ValidationException {
        if (!(context instanceof MediatorLangParser.ContinueStatementContext)) {
            throw ValidationException.IncompatibleContextType(this.getClass(), "ContinueStatementContext", context.toString());
        }

        setParent(parent);
        setContinueValue(Term.parse(((MediatorLangParser.ContinueStatementContext) context).term(), this));

        return this;
    }

    @Override
    public boolean equals(Object obj) {
        return
                this.toString().equals(obj.toString()) &&
                        obj instanceof Statement;
    }

    @Override
    public String toString() {
        return "continue " + continueValue.toString() + ";";
    }

    @Override
    public RawElement getParent() {
        return parent;
    }

    @Override
    public RawElement setParent(RawElement parent) {
        this.parent = parent;
        return this;
    }

    @Override
    public RawElement copy(RawElement parent) throws ValidationException {
        ContinueStatement nrs = new ContinueStatement();
        nrs.setParent(parent);
        nrs.setContinueValue(getContinueValue().copy(nrs));

        return nrs;
    }

    @Override
    public Statement refactor(Map<String, Type> typeRewriteMap, Map<String, Term> termRewriteMap) throws ValidationException {
        setContinueValue(getContinueValue().refactor(typeRewriteMap, termRewriteMap));
        return this;
    }
}
