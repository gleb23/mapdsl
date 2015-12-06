package command;

import domain.DomainObject;

/**
 * Created by hlib on 12/6/15.
 */
public class SelectCommand<T extends DomainObject> extends Command {

    private Class<? extends DomainObject> domainObjectClass;

    public SelectCommand(Class<? extends DomainObject> domainObjectClass) {
        this.domainObjectClass = domainObjectClass;
    }

    public Class<? extends DomainObject> getDomainObjectClass() {
        return domainObjectClass;
    }
}
