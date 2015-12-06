package interpreter.syntan;

/**
 * Created by hlib on 12/1/15.
 */
public class StateFactory {

    private final static State INITIAL_STATE = new InitialState();

    public State getInitialState() {
        return INITIAL_STATE;
    }
}
