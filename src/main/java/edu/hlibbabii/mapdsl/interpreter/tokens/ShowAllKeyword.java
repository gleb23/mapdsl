package edu.hlibbabii.mapdsl.interpreter.tokens;

import edu.hlibbabii.mapdsl.domain.DomainObject;

/**
 * Created by hlib on 12/7/15.
 */
public class ShowAllKeyword extends Token {
    private final Class<? extends DomainObject> domainClass;

    public ShowAllKeyword(Class<? extends DomainObject> domainClass) {
        this.domainClass = domainClass;
    }

    @Override
    public boolean isShowAllKeyword() {
        return true;
    }

    public Class<? extends DomainObject> getDomainClass() {
        return domainClass;
    }
}
