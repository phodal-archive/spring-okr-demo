package com.phodal.okr.advice;

import com.phodal.okr.exception.NoObjectiveFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({NoObjectiveFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse method(Exception exception) {
        return new ErrorResponse(HttpStatus.NOT_FOUND.value(), exception.getMessage());
    }


}
