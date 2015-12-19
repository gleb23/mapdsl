package edu.hlibbabii.mapdsl.interpreter.state;

/**
 * Created by hlib on 12/1/15.
 */
public class StateFactory {

    private final static State INITIAL_STATE = new InitialState();
    private final static State AFTER_IDENTIFIER_AT_THE_BEGINNING_STATE = new AfterIdentifierAtTheBeginningState();
    private final static State AFTER_SHOW_ALL_KEYWORDS_STATE = new AfterShowAllKeyWordsState();
    private final static State BEGORE_COUNTRY_DEFINITION_STATE = new BeforeCountryDefinitionState();
    private final static State AFTER_CREATE_KEYWORD_STATE = new AfterCreateKeywordState();
    private final static State AFTER_UPDATE_KEYWORD_STATE = new AfterUpdateKeywordState();
    private final static State AFTER_REMOVE_KEYWORD_STATE = new AfterRemoveKeywordState();
    private final static State AFTER_TOWN_NAME_IN_TOWN_DEFINITION = new AfterTownNameInTownDefinition();
    private final static State BEFORE_TOWN_DEFINITION_STATE = new BeforeTownDefinitionState();
    private final static State AFTER_POPULATION_IN_TOWN_DEFINITION = new AfterPopulationInTownDefinition();
    private final static State AFTER_REMOVE_STATE_PHRASE = new AfterRemovePhraseState();
    private final static State AFTER_UPDATE_PHRASE_STATE = new AfterUpdatePhraseState();
    private final static State AFTER_SEARCH_KEYWORD_STATE = new AfterSearchKeywordState();

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

    public static State getBegoreCountryDefinitionState() {
        return BEGORE_COUNTRY_DEFINITION_STATE;
    }

    public static State getAfterTownNameInTownDefinition() {
        return AFTER_TOWN_NAME_IN_TOWN_DEFINITION;
    }

    public static State getBeforeTownDefinitionState() {
        return BEFORE_TOWN_DEFINITION_STATE;
    }

    public static State getAfterPopulationInTownDefinition() {
        return AFTER_POPULATION_IN_TOWN_DEFINITION;
    }

    public static State getAfterRemoveStatePhrase() {
        return AFTER_REMOVE_STATE_PHRASE;
    }

    public static State getAfterUpdatePhraseState() {
        return AFTER_UPDATE_PHRASE_STATE;
    }

    public static State getAfterSearchKeywordState() {
        return AFTER_SEARCH_KEYWORD_STATE;
    }
}
