package edu.hlibbabii.mapdsl.command;

import edu.hlibbabii.mapdsl.domain.DomainObject;

/**
 * Created by hlib on 18.12.15.
 */
public abstract class CrudCommand<T extends DomainObject> extends Command {

    protected T domainObject;

    public CrudCommand(T domainObject) {
        this.domainObject = domainObject;
    }

    protected CrudCommand() {
    }

    public void setDomainObject(T domainObject) {
        this.domainObject = domainObject;
    }

    public T getDomainObject() {
        return domainObject;
    }
}
