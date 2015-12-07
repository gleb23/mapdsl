package edu.hlibbabii.mapdsl.interpreter.state;

import edu.hlibbabii.mapdsl.command.*;
import edu.hlibbabii.mapdsl.domain.DomainObject;
import edu.hlibbabii.mapdsl.domain.Town;
import javafx.util.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hlib on 12/1/15.
 */
public class InitialState extends State {

    private final static Logger log = LoggerFactory.getLogger(InitialState.class);

    @Override
    public Pair<State, Command> onIdentifier(Command command, String identifier) {
        Town town = new Town();
        town.setName(identifier);
        return new Pair<>(StateFactory.getAfterIdentifierAtTheBeginningState(), new CreateCommand<>(town));
    }

    @Override
    public Pair<State, Command> onShowAllKeyWord(Command command, Class<? extends DomainObject> domainClass) {
        return new Pair<>(StateFactory.getAfterShowAllKeywordsState(), new SelectCommand<>(domainClass));
    }

    @Override
    public Pair<State, Command> onCreateKeyWord(Command command) {
        return new Pair<>(StateFactory.getAfterCreateKeywordState(), new CreateCommand<>());
    }

    @Override
    public Pair<State, Command> onUpdateKeyWord(Command command) {
        return new Pair<>(StateFactory.getUpdateCreateKeywordState(), new UpdateCommand<>());
    }

    @Override
    public Pair<State, Command> onRemoveKeyWord(Command command) {
        return new Pair<>(StateFactory.getRemoveCreateKeywordState(), new RemoveCommand<>());
    }
}
