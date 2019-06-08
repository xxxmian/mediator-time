package org.fmgroup.mediator.language.statement;

import org.antlr.v4.runtime.ParserRuleContext;
import org.fmgroup.mediator.language.RawElement;
import org.fmgroup.mediator.language.ValidationException;
import org.fmgroup.mediator.language.generated.MediatorLangParser;
import org.fmgroup.mediator.language.term.Term;
import org.fmgroup.mediator.language.type.Type;

import java.util.Map;

public class IncreaseStatement implements Statement {

    private RawElement parent;
    private Term increaseValue;

    public Term getIncreaseValue() {
        return increaseValue;
    }

    public IncreaseStatement setIncreaseValue(Term increaseValue) {
        this.increaseValue = increaseValue;
        increaseValue.setParent(this);
        return this;
    }

    @Override
    public IncreaseStatement fromContext(ParserRuleContext context, RawElement parent) throws ValidationException {
        if (!(context instanceof MediatorLangParser.IncreaseStatementContext)) {
            throw ValidationException.IncompatibleContextType(this.getClass(), "IncreaseStatementContext", context.toString());
        }

        setParent(parent);
        setIncreaseValue(Term.parse(((MediatorLangParser.IncreaseStatementContext) context).term(), this));

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
        return "increase " + increaseValue.toString() + ";";
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
        IncreaseStatement nrs = new IncreaseStatement();
        nrs.setParent(parent);
        nrs.setIncreaseValue(getIncreaseValue().copy(nrs));

        return nrs;
    }

    @Override
    public Statement refactor(Map<String, Type> typeRewriteMap, Map<String, Term> termRewriteMap) throws ValidationException {
        setIncreaseValue(getIncreaseValue().refactor(typeRewriteMap, termRewriteMap));
        return this;
    }
}
