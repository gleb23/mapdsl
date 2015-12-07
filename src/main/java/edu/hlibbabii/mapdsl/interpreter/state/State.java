package edu.hlibbabii.mapdsl.interpreter.state;

import edu.hlibbabii.mapdsl.command.Command;
import edu.hlibbabii.mapdsl.domain.DomainObject;
import edu.hlibbabii.mapdsl.interpreter.ParseException;
import javafx.util.Pair;

/**
 * Created by hlib on 12/1/15.
 */
public class State {

    public Pair<State, Command> onIdentifier(Command command, String identifier) {
        throw new ParseException();
    }

    public Pair<State, Command> onStar(Command command) {
        throw new ParseException();
    }

    public Pair<State, Command> onNumber(Command command, long number) {
        throw new ParseException();
    }

    public Pair<State, Command> onSemicolon(Command command) {
        throw new ParseException();
    }

    public Pair<State, Command> onDoubleLessThan(Command command) {
        throw new ParseException();
    }

    public Pair<State, Command> onShowAllKeyWord(Command command, Class<? extends DomainObject> domainClass) {
        throw  new ParseException();
    }

    public Pair<State, Command> onDomainKeyWord(Command command, Class<? extends DomainObject> domainClass) {
        throw  new ParseException();
    }

    public Pair<State, Command> onCreateKeyWord(Command command) {
        throw  new ParseException();
    }

    public Pair<State, Command> onUpdateKeyWord(Command command) {
        throw  new ParseException();
    }

    public Pair<State, Command> onRemoveKeyWord(Command command) {
        throw  new ParseException();
    }

    public Pair<State, Command> onSearchKeyWord(Command command) {
        throw  new ParseException();
    }
}
