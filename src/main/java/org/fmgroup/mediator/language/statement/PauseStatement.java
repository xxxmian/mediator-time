package org.fmgroup.mediator.language.statement;

import org.antlr.v4.runtime.ParserRuleContext;
import org.fmgroup.mediator.language.RawElement;
import org.fmgroup.mediator.language.ValidationException;
import org.fmgroup.mediator.language.generated.MediatorLangParser;
import org.fmgroup.mediator.language.term.NullValue;
import org.fmgroup.mediator.language.term.Term;
import org.fmgroup.mediator.language.type.Type;

import java.util.Map;

public class PauseStatement implements Statement {

    private RawElement parent;
    private Term pauseValue;

    public Term getPauseValue() {
        return pauseValue;
    }

    public PauseStatement setPauseValue(Term pauseValue) {
        this.pauseValue = pauseValue;
        pauseValue.setParent(this);
        return this;
    }

    @Override
    public PauseStatement fromContext(ParserRuleContext context, RawElement parent) throws ValidationException {
        if (!(context instanceof MediatorLangParser.PauseStatementContext)) {
            throw ValidationException.IncompatibleContextType(this.getClass(), "PauseStatementContext", context.toString());
        }

        setParent(parent);
        setPauseValue(Term.parse(((MediatorLangParser.PauseStatementContext) context).term(), this));

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
        return "pause " + pauseValue.toString() + ";";
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
        PauseStatement nrs = new PauseStatement();
        nrs.setParent(parent);
        nrs.setPauseValue(getPauseValue().copy(nrs));

        return nrs;
    }

    @Override
    public Statement refactor(Map<String, Type> typeRewriteMap, Map<String, Term> termRewriteMap) throws ValidationException {
        setPauseValue(getPauseValue().refactor(typeRewriteMap, termRewriteMap));
        return this;
    }
}
