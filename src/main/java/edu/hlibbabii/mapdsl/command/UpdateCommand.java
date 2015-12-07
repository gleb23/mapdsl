package edu.hlibbabii.mapdsl.command;

import edu.hlibbabii.mapdsl.domain.DomainObject;

/**
 * Created by hlib on 12/6/15.
 */
public class UpdateCommand<T extends DomainObject> extends Command {
    @Override
    public void execute() {
        System.out.println("Update edu.hlibbabii.mapdsl.command");
    }
}
