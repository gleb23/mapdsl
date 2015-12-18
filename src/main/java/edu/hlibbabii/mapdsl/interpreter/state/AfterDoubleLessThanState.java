package edu.hlibbabii.mapdsl.interpreter.state;

import edu.hlibbabii.mapdsl.command.Command;
import edu.hlibbabii.mapdsl.command.CrudCommand;
import edu.hlibbabii.mapdsl.domain.Town;
import javafx.util.Pair;

/**
 * Created by hlib on 18.12.15.
 */
public class AfterDoubleLessThanState extends State {
    @Override
    public Pair<State, Command> onIdentifier(Command command, String identifier) {
        CrudCommand<Town> crudCommand = (CrudCommand) command;
        Town town = crudCommand.getDomainObject();
        town.setName(identifier);
        return new Pair<>(StateFactory.getAfterTownNameInTownDefinition(), command);
    }
}
