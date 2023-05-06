package com.rest.springbootemployee.exception;

public class NoObjectiveFoundException extends RuntimeException {
    public NoObjectiveFoundException() {
        super("No objective found");
    }
}
