package edu.hlibbabii.mapdsl.interpreter.state;

/**
 * Created by hlib on 12/1/15.
 */
public class StateFactory {

    private final static State INITIAL_STATE = new InitialState();
    private final static State AFTER_IDENTIFIER_AT_THE_BEGINNING_STATE = new AfterIdentifierAtTheBeginningState();
    private final static State AFTER_SHOW_ALL_KEYWORDS_STATE = new AfterShowAllKeyWordsState();
    private final static State AFTER_CREATE_COUNTRY_PHRASE_STATE = new AfterCreateCountryPhraseState();
    private final static State AFTER_CREATE_KEYWORD_STATE = new AfterCreateKeywordState();
    private final static State AFTER_UPDATE_KEYWORD_STATE = new AfterUpdateKeywordState();
    private final static State AFTER_REMOVE_KEYWORD_STATE = new AfterRemoveKeywordState();
    private final static State AFTER_TOWN_NAME_IN_TOWN_DEFINITION = new AfterTownNameInTownDefinition();
    private final static State AFTER_DOUBLE_LESS_THAN_STATE = new AfterDoubleLessThanState();
    private final static State AFTER_POPULATION_IN_TOWN_DEFINITION = new AfterPopulationInTownDefinition();

    public static State getInitialState() {
        return INITIAL_STATE;
    }

    public static State getAfterIdentifierAtTheBeginningState() {
        return AFTER_IDENTIFIER_AT_THE_BEGINNING_STATE;
    }

    public static State getAfterShowAllKeywordState() {
        return AFTER_SHOW_ALL_KEYWORDS_STATE;
    }

    public static State getAfterCreateKeywordState() {
        return AFTER_CREATE_KEYWORD_STATE;
    }

    public static State getUpdateCreateKeywordState() {
        return AFTER_UPDATE_KEYWORD_STATE;
    }

    public static State getRemoveCreateKeywordState() {
        return AFTER_REMOVE_KEYWORD_STATE;
    }

    public static State getAfterCreateCountryPhraseState() {
        return AFTER_CREATE_COUNTRY_PHRASE_STATE;
    }

    public static State getAfterTownNameInTownDefinition() {
        return AFTER_TOWN_NAME_IN_TOWN_DEFINITION;
    }

    public static State getAfterDoubleLessThanState() {
        return AFTER_DOUBLE_LESS_THAN_STATE;
    }

    public static State getAfterPopulationInTownDefinition() {
        return AFTER_POPULATION_IN_TOWN_DEFINITION;
    }
}
