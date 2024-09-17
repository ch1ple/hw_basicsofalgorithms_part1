package me.ch1ple.hw_basicsofalgorithms_part1;

public class NullItemException extends RuntimeException {
    public NullItemException(String message) {
        super(message);
    }

    public NullItemException() {
    }

    public NullItemException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullItemException(Throwable cause) {
        super(cause);
    }

    public NullItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
