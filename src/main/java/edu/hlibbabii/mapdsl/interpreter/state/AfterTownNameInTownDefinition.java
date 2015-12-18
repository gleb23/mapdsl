package edu.hlibbabii.mapdsl.interpreter.state;

import edu.hlibbabii.mapdsl.command.Command;
import edu.hlibbabii.mapdsl.command.CrudCommand;
import edu.hlibbabii.mapdsl.domain.Town;
import javafx.util.Pair;

/**
 * Created by hlib on 18.12.15.
 */
public class AfterTownNameInTownDefinition extends State {
    @Override
    public Pair<State, Command> onNumber(Command command, long number) {
        CrudCommand<Town> crudCommand = (CrudCommand) command;
        crudCommand.getDomainObject().setPopulation(number);
        return new Pair<>(StateFactory.getAfterPopulationInTownDefinition(), command);
    }

    @Override
    public Pair<State, Command> onStar(Command command) {
        CrudCommand<Town> crudCommand = (CrudCommand) command;
        crudCommand.getDomainObject().setCapital(true);
        return new Pair<>(this, command);
    }
}
