package com.bl;

public class MoodAnalyzerException extends Exception {
    ExceptionType type;

    // Whether the mood is null pr empty is informed to user.
    enum ExceptionType {
        ENTERED_EMPTY, ENTERED_NULL
    }

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public MoodAnalyzerException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
