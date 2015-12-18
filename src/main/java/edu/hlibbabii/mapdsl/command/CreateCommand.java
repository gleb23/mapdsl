package edu.hlibbabii.mapdsl.command;

import edu.hlibbabii.mapdsl.domain.DomainObject;

/**
 * Created by hlib on 12/6/15.
 */
public class CreateCommand<T extends DomainObject> extends CrudCommand<T> {

    public CreateCommand(T domainObject) {
        super(domainObject);
    }

    public CreateCommand() {
        super();
    }

    @Override
    public void execute() {
        System.out.println("Create edu.hlibbabii.mapdsl.command " + domainObject);
    }
}
