package edu.hlibbabii.mapdsl.interpreter.state;

import edu.hlibbabii.mapdsl.command.Command;
import edu.hlibbabii.mapdsl.command.CrudCommand;
import edu.hlibbabii.mapdsl.domain.DomainObject;
import javafx.util.Pair;

/**
 * Created by hlib on 12/6/15.
 */
public class AfterRemoveKeywordState extends State {
    @Override
    public Pair<State, Command> onDomainKeyWord(Command command, Class<? extends DomainObject> domainClass) {
        CrudCommand crudCommand = (CrudCommand) command;
        try {
            crudCommand.setDomainObject(domainClass.newInstance());
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException();
        }
        return new Pair<>(StateFactory.getAfterRemoveStatePhrase(), command);
    }
}
