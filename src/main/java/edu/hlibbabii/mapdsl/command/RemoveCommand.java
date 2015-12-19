package edu.hlibbabii.mapdsl.command;

import edu.hlibbabii.mapdsl.domain.DomainObject;

/**
 * Created by hlib on 12/6/15.
 */
public class RemoveCommand<T extends DomainObject> extends CrudCommand<T> {
    @Override
    public void execute() {
        System.out.println("Remove edu.hlibbabii.mapdsl.command "  + domainObject);
    }
}
