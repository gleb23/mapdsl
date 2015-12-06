package interpreter.syntan;

import command.Command;
import javafx.util.Pair;

/**
 * Created by hlib on 12/6/15.
 */
public class AfterIdentifierAtTheBeginningState extends State {
    @Override
    public Pair<State, Command> onDoubleLessThan(Command command) {
        return super.onDoubleLessThan(command);
    }
}
