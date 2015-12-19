package edu.hlibbabii.mapdsl.interpreter.state;

import edu.hlibbabii.mapdsl.command.Command;
import edu.hlibbabii.mapdsl.command.SearchCommand;
import javafx.util.Pair;

/**
 * Created by hlib on 19.12.15.
 */
public class AfterSearchKeywordState extends State {
    @Override
    public Pair<State, Command> onIdentifier(Command command, String identifier) {
        return new Pair<>(StateFactory.getInitialState(), new SearchCommand(identifier));
    }
}
