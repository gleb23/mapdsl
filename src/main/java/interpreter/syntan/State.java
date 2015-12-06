package interpreter.syntan;

import command.Command;
import javafx.util.Pair;

/**
 * Created by hlib on 12/1/15.
 */
public class State {

    public Pair<State, Command> onIdentifier(Command command, String identifier) {
        throw new IllegalStateException();
    }

    public Pair<State, Command> onStar(Command command) {
        throw new IllegalStateException();
    }

    public Pair<State, Command> onNumber(Command command, long number) {
        throw new IllegalStateException();
    }

    public Pair<State, Command> onSemicolon(Command command) {
        throw new IllegalStateException();
    }

    public Pair<State, Command> onDoubleLessThan(Command command) {
        throw new IllegalStateException();
    }

    public Pair<State, Command> onShowAllKeyWord(Command command, String keyWord) {
        throw  new IllegalArgumentException();
    }

    public Pair<State, Command> onCreateKeyWord(Command command) {
        throw  new IllegalArgumentException();
    }

    public Pair<State, Command> onUpdateKeyWord(Command command) {
        throw  new IllegalArgumentException();
    }

    public Pair<State, Command> onRemoveKeyWord(Command command) {
        throw  new IllegalArgumentException();
    }

    public Pair<State, Command> onSearchKeyWord(Command command) {
        throw  new IllegalArgumentException();
    }
}
