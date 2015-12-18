package edu.hlibbabii.mapdsl.command;

import edu.hlibbabii.mapdsl.domain.DomainObject;

/**
 * Created by hlib on 12/6/15.
 */
public class SelectCommand<T extends DomainObject> extends CrudCommand<T> {

    public SelectCommand(T domainObject) {
        this.domainObject = domainObject;
    }

    @Override
    public void execute() {
        System.out.println("Select edu.hlibbabii.mapdsl.command " + domainObject);
    }
}
