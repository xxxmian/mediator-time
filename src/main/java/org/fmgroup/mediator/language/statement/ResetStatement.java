package org.fmgroup.mediator.language.statement;

import org.antlr.v4.runtime.ParserRuleContext;
import org.fmgroup.mediator.language.RawElement;
import org.fmgroup.mediator.language.ValidationException;
import org.fmgroup.mediator.language.generated.MediatorLangParser;
import org.fmgroup.mediator.language.term.Term;
import org.fmgroup.mediator.language.type.Type;

import java.util.Map;

public class ResetStatement implements Statement {

    private RawElement parent;
    private Term resetValue;

    public Term getResetValue() {
        return resetValue;
    }

    public ResetStatement setResetValue(Term resetValue) {
        this.resetValue = resetValue;
        resetValue.setParent(this);
        return this;
    }

    @Override
    public ResetStatement fromContext(ParserRuleContext context, RawElement parent) throws ValidationException {
        if (!(context instanceof MediatorLangParser.ResetStatementContext)) {
            throw ValidationException.IncompatibleContextType(this.getClass(), "ResetStatementContext", context.toString());
        }

        setParent(parent);
        setResetValue(Term.parse(((MediatorLangParser.ResetStatementContext) context).term(), this));

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
        return "reset " + resetValue.toString() + ";";
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
        ResetStatement nrs = new ResetStatement();
        nrs.setParent(parent);
        nrs.setResetValue(getResetValue().copy(nrs));

        return nrs;
    }

    @Override
    public Statement refactor(Map<String, Type> typeRewriteMap, Map<String, Term> termRewriteMap) throws ValidationException {
        setResetValue(getResetValue().refactor(typeRewriteMap, termRewriteMap));
        return this;
    }
}
