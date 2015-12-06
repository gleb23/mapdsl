package interpreter.syntan;

/**
 * Created by hlib on 12/1/15.
 */
public class Syntan {
    private StateFactory stateFactory;
    private State currentState;

    public Syntan(StateFactory stateFactory) {
        this.stateFactory = stateFactory;
        currentState = stateFactory.getInitialState();
    }
}
