package com.amazon.spapi.documents.exception;

/**
 * Missing charset exception.
 */
public class MissingCharsetException extends Exception {

    private static final long serialVersionUID = -475864122808996950L;

    /**
     * {@inheritDoc}
     */
    public MissingCharsetException(String message) {
        super(message);
    }
}
