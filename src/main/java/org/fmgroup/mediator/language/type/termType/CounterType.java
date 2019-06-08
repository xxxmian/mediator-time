package org.fmgroup.mediator.language.type.termType;

import org.antlr.v4.runtime.ParserRuleContext;
import org.fmgroup.mediator.language.RawElement;
import org.fmgroup.mediator.language.ValidationException;
import org.fmgroup.mediator.language.generated.MediatorLangParser;
import org.fmgroup.mediator.language.term.Term;
import org.fmgroup.mediator.language.type.Type;

import java.util.Map;

public class CounterType implements Type {

    private RawElement parent = null;

    @Override
    public CounterType fromContext(ParserRuleContext context, RawElement parent) throws ValidationException {
        if (!(context instanceof MediatorLangParser.CounterTypeContext)) {
            throw ValidationException.IncompatibleContextType(this.getClass(), "CounterTypeContext", context.toString());
        }

        setParent(parent);
        return this;
    }

    @Override
    public String toString() {
        return "counter";
    }

    @Override
    public RawElement getParent() {
        return parent;
    }

    @Override
    public CounterType setParent(RawElement parent) {
        this.parent = parent;
        return this;
    }

    @Override
    public CounterType copy(RawElement parent) throws ValidationException {
        return new CounterType().setParent(parent);
    }

    @Override
    public Type refactor(Map<String, Type> typeRewriteMap, Map<String, Term> termRewriteMap) throws ValidationException {
        return this;
    }
}
