package edu.hlibbabii.mapdsl.interpreter.tokens;

/**
 * Created by hlib on 19.12.15.
 */
public class NumberToken extends Token {

    private final long value;

    public NumberToken(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    @Override
    public boolean isNumber() {
        return true;
    }
}
