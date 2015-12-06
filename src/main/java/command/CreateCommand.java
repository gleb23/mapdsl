package command;

import domain.DomainObject;

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
}
