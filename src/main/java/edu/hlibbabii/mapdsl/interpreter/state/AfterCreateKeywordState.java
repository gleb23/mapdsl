package edu.hlibbabii.mapdsl.interpreter.state;

import edu.hlibbabii.mapdsl.command.Command;
import edu.hlibbabii.mapdsl.domain.DomainObject;
import javafx.util.Pair;

/**
 * Created by hlib on 12/6/15.
 */
public class AfterCreateKeywordState extends State {
    @Override
    public Pair<State, Command> onDomainKeyWord(Command command, Class<? extends DomainObject> domainClass) {
        return new Pair<>(StateFactory.getBegoreCountryDefinitionState(), command);
    }
}
