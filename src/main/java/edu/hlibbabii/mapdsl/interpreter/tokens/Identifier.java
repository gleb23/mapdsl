package edu.hlibbabii.mapdsl.interpreter.tokens;

/**
 * Created by hlib on 12/6/15.
 */
public class Identifier extends Token {
    private String str;

    public Identifier(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return str;
    }

    @Override
    public boolean isIdentifier() {
        return true;
    }
}
