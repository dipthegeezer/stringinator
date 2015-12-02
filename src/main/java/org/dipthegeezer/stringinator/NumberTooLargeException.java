package org.dipthegeezer.stringinator;

public class NumberTooLargeException extends Exception{
    public NumberTooLargeException() {
    }

    public NumberTooLargeException(String s) {
        super(s);
    }

    public NumberTooLargeException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public NumberTooLargeException(Throwable throwable) {
        super(throwable);
    }

    public NumberTooLargeException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
