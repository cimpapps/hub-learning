package com.abc.hublearning.web.exception_classes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class ResourceNotFoundException extends RuntimeException{

    private String message;
    long code;

    public ResourceNotFoundException(String message, long code) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ResourceNotFoundException{" +
                "message='" + message + '\'' +
                ", code=" + code +
                '}';
    }
}
