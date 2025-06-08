package com.intheeast.jdkproxy.baz;

public class BazException extends Exception {
    public BazException() {
        super();
    }

    public BazException(String message) {
        super(message);
    }

    public BazException(String message, Throwable cause) {
        super(message, cause);
    }

    public BazException(Throwable cause) {
        super(cause);
    }
}