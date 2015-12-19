package edu.hlibbabii.mapdsl.interpreter;

import edu.hlibbabii.mapdsl.domain.Country;
import edu.hlibbabii.mapdsl.domain.DomainObject;
import edu.hlibbabii.mapdsl.domain.Town;
import edu.hlibbabii.mapdsl.interpreter.tokens.*;
import edu.hlibbabii.mapdsl.interpreter.tokens.NumberToken;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by hlib on 12/6/15.
 */
public class LexAn implements Iterator<Token> {

    protected final static Map<String, Class<? extends DomainObject>> SHOW_ALL_KEYWORDS_MAP
            = new HashMap<String, Class<? extends DomainObject>>() {{
        put("TOWNS", Town.class);
        put("COUNTRIES", Country.class);
    }};
    protected final static Map<String, Class<? extends DomainObject>> DOMAIN_KEYWORDS
            = new HashMap<String, Class<? extends DomainObject>>() {{
        put("TOWN", Town.class);
        put("COUNTRY", Country.class);
    }};

    private final static String UPDATE_KEYWORD = "UPDATE";
    private final static String REMOVE_KEYWORD = "REMOVE";
    private final static String SEARCH_KEYWORD = "SEARCH";
    private final static String CREATE_KEYWORD = "CREATE";

    private Iterator<String> tokens;

    public LexAn() {
    }

    public void set(String text) {
        init(text);
    }

    private void init(String text) {
        this.tokens = Arrays.asList(text.split(" ")).iterator();
    }

    @Override
    public boolean hasNext() {
        return tokens.hasNext();
    }

    @Override
    public Token next() {
        String str = tokens.next();
        if (UPDATE_KEYWORD.equals(str)) {
            return new UpdateKeyWord();
        } else if (REMOVE_KEYWORD.equals(str)) {
            return new RemoveKeyword();
        } else if (CREATE_KEYWORD.equals(str)) {
            return new CreateKeyword();
        } else if (SEARCH_KEYWORD.equals(str)) {
            return new SearchKeyWord();
        } else if ("<<".equals(str)) {
            return new DoubleLessThan();
        } else if ("*".equals(str)) {
            return new Star();
        } else if (DOMAIN_KEYWORDS.containsKey(str)) {
            return new DomainKeyword(DOMAIN_KEYWORDS.get(str));
        } else if (SHOW_ALL_KEYWORDS_MAP.containsKey(str)) {
            return new ShowAllKeyword(SHOW_ALL_KEYWORDS_MAP.get(str));
        } else if (getNumber(str) != null) {
            return getNumber(str);
        } else {
            return new Identifier(str);
        }
    }

    private Token getNumber(String str) {
        try {
            return new NumberToken(Long.parseLong(str));
        } catch (NumberFormatException ex) {
            return null;
        }
    }
}
