package me.ch1ple.hw_basicsofalgorithms_part1;

public class InvalidIndexException extends RuntimeException {
    public InvalidIndexException() {
    }

    public InvalidIndexException(String message) {
        super(message);
    }

    public InvalidIndexException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIndexException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public InvalidIndexException(Throwable cause) {
        super(cause);
    }
}
