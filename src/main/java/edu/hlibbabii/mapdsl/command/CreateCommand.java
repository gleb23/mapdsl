package edu.hlibbabii.mapdsl.command;

import edu.hlibbabii.mapdsl.domain.DomainObject;

/**
 * Created by hlib on 12/6/15.
 */
public class CreateCommand<T extends DomainObject> extends Command {

    private T objectToCteate;

    public CreateCommand(T objectToCteate) {
        this.objectToCteate = objectToCteate;
    }

    public CreateCommand() {
    }

    public T getObjectToCteate() {
        return objectToCteate;
    }

    @Override
    public void execute() {
        System.out.println("Create edu.hlibbabii.mapdsl.command " + objectToCteate);
    }
}
