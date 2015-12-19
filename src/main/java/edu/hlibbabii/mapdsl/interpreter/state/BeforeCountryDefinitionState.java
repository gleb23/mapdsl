package edu.hlibbabii.mapdsl.interpreter.state;

import edu.hlibbabii.mapdsl.command.Command;
import edu.hlibbabii.mapdsl.command.CrudCommand;
import edu.hlibbabii.mapdsl.domain.Country;
import javafx.util.Pair;

/**
 * Created by hlib on 18.12.15.
 */
public class BeforeCountryDefinitionState extends State {
    @Override
    public Pair<State, Command> onIdentifier(Command command, String identifier) {
        CrudCommand<Country> crudCommand = (CrudCommand) command;
        Country country = crudCommand.getDomainObject();
        if (country == null) {
            country = new Country();
            crudCommand.setDomainObject(country);
        }
        country.setName(identifier);
        return new Pair<>(StateFactory.getAfterTownNameInTownDefinition(), command);
    }
}
