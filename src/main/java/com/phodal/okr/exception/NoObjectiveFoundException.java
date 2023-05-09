package com.phodal.okr.exception;

public class NoObjectiveFoundException extends RuntimeException {
    public NoObjectiveFoundException() {
        super("No objective found");
    }
}
