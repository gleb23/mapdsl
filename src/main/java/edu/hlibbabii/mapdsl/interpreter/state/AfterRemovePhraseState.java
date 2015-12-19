package edu.hlibbabii.mapdsl.interpreter.state;

import edu.hlibbabii.mapdsl.command.Command;
import edu.hlibbabii.mapdsl.command.CrudCommand;
import javafx.util.Pair;

/**
 * Created by hlib on 19.12.15.
 */
public class AfterRemovePhraseState extends State {
    @Override
    public Pair<State, Command> onNumber(Command command, long number) {
        CrudCommand crudCommand = (CrudCommand) command;
        crudCommand.getDomainObject().setId(String.valueOf(number));
        return new Pair<>(this, command);
    }
}
