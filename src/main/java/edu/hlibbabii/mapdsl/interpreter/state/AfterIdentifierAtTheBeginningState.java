package edu.hlibbabii.mapdsl.interpreter.state;

import edu.hlibbabii.mapdsl.command.Command;
import javafx.util.Pair;

/**
 * Created by hlib on 12/6/15.
 */
public class AfterIdentifierAtTheBeginningState extends State {
    @Override
    public Pair<State, Command> onDoubleLessThan(Command command) {
        return new Pair<>(StateFactory.getBeforeTownDefinitionState(), command);
    }
}
