package edu.hlibbabii.mapdsl.interpreter.tokens;

/**
 * Created by hlib on 12/6/15.
 */
public class Token {
    public boolean isStar() {
        return false;
    }

    public boolean isDoubleLessThan() {
        return false;
    }

    public boolean isIdentifier() {
        return false;
    }

    public boolean isUpdateKeyWord() {
        return false;
    }

    public boolean isCreateKeyWord() {
        return false;
    }

    public boolean isSearchKeyWord() {
        return false;
    }

    public boolean isRemoveKeyWord() {
        return false;
    }

    public boolean isDomainKeyword() {
        return false;
    }

    public boolean isShowAllKeyword() {
        return false;
    }
}
