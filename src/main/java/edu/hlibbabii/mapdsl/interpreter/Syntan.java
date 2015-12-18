package edu.hlibbabii.mapdsl.interpreter;

import edu.hlibbabii.mapdsl.command.Command;
import edu.hlibbabii.mapdsl.command.EmptyCommand;
import edu.hlibbabii.mapdsl.interpreter.state.State;
import edu.hlibbabii.mapdsl.interpreter.state.StateFactory;
import edu.hlibbabii.mapdsl.interpreter.tokens.DomainKeyword;
import edu.hlibbabii.mapdsl.interpreter.tokens.Identifier;
import edu.hlibbabii.mapdsl.interpreter.tokens.ShowAllKeyword;
import edu.hlibbabii.mapdsl.interpreter.tokens.Token;
import javafx.util.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hlib on 12/1/15.
 */
public class Syntan {

    private final static Logger log = LoggerFactory.getLogger(Syntan.class);

    private LexAn lexAn;

    private State currentState;

    public Syntan(LexAn lexAn) {
        this.lexAn = lexAn;
        currentState = StateFactory.getInitialState();
    }

    public Command doAn() {
        currentState = StateFactory.getInitialState();
        Command currentCommand = null;
        Pair<State, Command> pair;
        List<State> states = new ArrayList<>();
        states.add(currentState);
        while (lexAn.hasNext()) {
            try {
                Token token = lexAn.next();
                if (token.isIdentifier()) {
                    pair = currentState.onIdentifier(currentCommand, ((Identifier) token).getStr());
                } else if (token.isDoubleLessThan()) {
                    pair = currentState.onDoubleLessThan(currentCommand);
                } else if (token.isStar()) {
                    pair = currentState.onStar(currentCommand);
                } else if (token.isDomainKeyword()) {
                    pair = currentState.onDomainKeyWord(currentCommand, ((DomainKeyword) token).getDomainClass());
                } else if (token.isShowAllKeyword()) {
                    pair = currentState.onShowAllKeyWord(currentCommand, ((ShowAllKeyword) token).getDomainClass());
                } else if (token.isUpdateKeyWord()) {
                    pair = currentState.onUpdateKeyWord(currentCommand);
                } else if (token.isCreateKeyWord()) {
                    pair = currentState.onCreateKeyWord(currentCommand);
                } else if (token.isSearchKeyWord()) {
                    pair = currentState.onSearchKeyWord(currentCommand);
                } else if (token.isRemoveKeyWord()) {
                    pair = currentState.onRemoveKeyWord(currentCommand);
                } else {
                    throw new RuntimeException("Unrecognized token: " + token);
                }
                currentState = pair.getKey();
                currentCommand = pair.getValue();
                states.add(currentState);
            } catch (ParseException ex) {
                log.info(states.toString());
                return new EmptyCommand();
            }
        }
        return currentCommand;
    }
}
