package interpreter.syntan;

import command.Command;
import command.CreateCommand;
import command.RemoveCommand;
import command.SelectCommand;
import domain.DomainObject;
import domain.Town;
import javafx.util.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static interpreter.syntan.StateFactory.*;

/**
 * Created by hlib on 12/1/15.
 */
public class InitialState extends State {

    private final static Logger log = LoggerFactory.getLogger(InitialState.class);

    @Override
    public Pair<State, Command> onIdentifier(Command command, String identifier) {
        Town town = new Town();
        town.setName(identifier);
        return new Pair<>(getAfterIdentifierAtTheBeginningState(), new CreateCommand<>(town));
    }

    @Override
    public Pair<State, Command> onShowAllKeyWord(Command command, String keyWord) {
        Class<? extends DomainObject> domainObjectClass = SHOW_ALL_KEYWORDS_MAP.get(keyWord);
        return new Pair<>(getAfterShowAllKeywordsState(), new SelectCommand<>(domainObjectClass));
    }

    @Override
    public Pair<State, Command> onCreateKeyWord(Command command) {
        return new Pair<>(getAfterCreateKeywordState(), new CreateCommand<>());
    }

    @Override
    public Pair<State, Command> onUpdateKeyWord(Command command) {
        return new Pair<>(getUpdateCreateKeywordState(), new UpdateCommand<>());
    }

    @Override
    public Pair<State, Command> onRemoveKeyWord(Command command) {
        return new Pair<>(getRemoveCreateKeywordState(), new RemoveCommand<>());
    }
}
