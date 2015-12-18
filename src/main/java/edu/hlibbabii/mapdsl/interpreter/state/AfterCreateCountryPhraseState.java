package edu.hlibbabii.mapdsl.interpreter.state;

import edu.hlibbabii.mapdsl.command.Command;
import edu.hlibbabii.mapdsl.command.CrudCommand;
import edu.hlibbabii.mapdsl.domain.Country;
import javafx.util.Pair;

/**
 * Created by hlib on 18.12.15.
 */
public class AfterCreateCountryPhraseState extends State {
    @Override
    public Pair<State, Command> onIdentifier(Command command, String identifier) {
        ((CrudCommand)command).setDomainObject(new Country(identifier));
        return new Pair<>(StateFactory.getAfterTownNameInTownDefinition(), command);
    }
}
