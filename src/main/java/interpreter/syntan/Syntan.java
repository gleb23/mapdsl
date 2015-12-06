package interpreter.syntan;

import command.Command;
import interpreter.LexAn;
import interpreter.tokens.Identifier;
import interpreter.tokens.Token;
import javafx.util.Pair;

/**
 * Created by hlib on 12/1/15.
 */
public class Syntan {

    private LexAn lexAn;
    private StateFactory stateFactory;

    private State currentState;

    public Syntan(LexAn lexAn, StateFactory stateFactory) {
        this.lexAn = lexAn;
        this.stateFactory = stateFactory;
        currentState = stateFactory.getInitialState();
    }

    public void doAn() {
        Command currentCommand = null;
        Pair<State, Command> pair;
        while (lexAn.hasNext()) {
            Token token = lexAn.next();
            if (token.isIdentifier()) {
               pair  = currentState.onIdentifier(currentCommand, ((Identifier) token).getStr());
            } else if (token.isDoubleLessThan()) {
                pair = currentState.onDoubleLessThan(currentCommand);
            } else if (token.isStar()) {
                pair = currentState.onStar(currentCommand);
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
        }
    }
}
