package edu.hlibbabii.mapdsl.interpreter.tokens;

import edu.hlibbabii.mapdsl.domain.DomainObject;

/**
 * Created by hlib on 12/7/15.
 */
public class DomainKeyword extends Token {
    private final Class<? extends DomainObject> domainClass;

    public DomainKeyword(Class<? extends DomainObject> domainClass) {
        this.domainClass = domainClass;
    }

    @Override
    public boolean isDomainKeyword() {
        return true;
    }

    public Class<? extends DomainObject> getDomainClass() {
        return domainClass;
    }
}
