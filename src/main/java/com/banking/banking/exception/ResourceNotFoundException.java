package com.banking.banking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
//Marks a method or exception class with the status code() and reason() that should be returned.
public class ResourceNotFoundException extends RuntimeException {
    // causes exception when an object that is expected to have a value but is actually null

    public ResourceNotFoundException(String message) {
        super(message);
    }
    // gets message from parent class
  //  Constructs a new runtime exception with the specified detail message.

}
