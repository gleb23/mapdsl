package edu.hlibbabii.mapdsl.interpreter.state;

import edu.hlibbabii.mapdsl.command.Command;
import edu.hlibbabii.mapdsl.command.CrudCommand;
import edu.hlibbabii.mapdsl.domain.DomainObject;
import edu.hlibbabii.mapdsl.domain.Town;
import javafx.util.Pair;

/**
 * Created by hlib on 19.12.15.
 */
public class AfterUpdatePhraseState extends State {
    @Override
    public Pair<State, Command> onNumber(Command command, long number) {
        CrudCommand crudCommand = (CrudCommand) command;
        DomainObject domainObject = crudCommand.getDomainObject();
        domainObject.setId(String.valueOf(number));
        State nextState = domainObject instanceof Town ?
                StateFactory.getBeforeTownDefinitionState() :
                StateFactory.getBegoreCountryDefinitionState();
        return new Pair<>(nextState, crudCommand);
    }
}
