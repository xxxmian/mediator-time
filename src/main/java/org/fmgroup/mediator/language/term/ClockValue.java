package org.fmgroup.mediator.language.term;

import org.antlr.v4.runtime.ParserRuleContext;
import org.fmgroup.mediator.language.RawElement;
import org.fmgroup.mediator.language.ValidationException;
import org.fmgroup.mediator.language.generated.MediatorLangParser;
import org.fmgroup.mediator.language.type.termType.ClockType;
import org.fmgroup.mediator.language.type.Type;

public class ClockValue implements Value {

    private RawElement parent = null;
    private int value;

    public int getValue() {
        return value;
    }

    public ClockValue setValue(int value) {
        this.value = value;
        return this;
    }

    @Override
    public Type getType() {
        return new ClockType();
    }

    @Override
    public int getPrecedence() {
        return 14;
    }

    @Override
    public ClockValue fromContext(ParserRuleContext context, RawElement parent) throws ValidationException {
        if (!(context instanceof MediatorLangParser.ClockValueContext)) {
            throw ValidationException.IncompatibleContextType(this.getClass(), "ClockValueContext", context.toString());
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
    public ClockValue setParent(RawElement parent) {
        this.parent = parent;
        return this;
    }

    @Override
    public ClockValue copy(RawElement parent) throws ValidationException {
        return new ClockValue().setParent(parent)
                .setValue(this.value);
    }
}
