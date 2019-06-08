package org.fmgroup.mediator.language.term;

import org.antlr.v4.runtime.ParserRuleContext;
import org.fmgroup.mediator.language.RawElement;
import org.fmgroup.mediator.language.ValidationException;
import org.fmgroup.mediator.language.generated.MediatorLangParser;
import org.fmgroup.mediator.language.type.termType.CounterType;
import org.fmgroup.mediator.language.type.Type;

public class CounterValue implements Value {

    private RawElement parent = null;
    private int value;

    public int getValue() {
        return value;
    }

    public CounterValue setValue(int value) {
        this.value = value;
        return this;
    }

    @Override
    public Type getType() {
        return new CounterType();
    }

    @Override
    public int getPrecedence() {
        return 14;
    }

    @Override
    public CounterValue fromContext(ParserRuleContext context, RawElement parent) throws ValidationException {
        if (!(context instanceof MediatorLangParser.CounterValueContext)) {
            throw ValidationException.IncompatibleContextType(this.getClass(), "CounterValueContext", context.toString());
        }

        setParent(parent);
        setValue(Integer.parseInt(context.getText()));
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public RawElement getParent() {
        return parent;
    }

    @Override
    public CounterValue setParent(RawElement parent) {
        this.parent = parent;
        return this;
    }

    @Override
    public CounterValue copy(RawElement parent) throws ValidationException {
        return new CounterValue().setParent(parent)
                .setValue(this.value);
    }
}
