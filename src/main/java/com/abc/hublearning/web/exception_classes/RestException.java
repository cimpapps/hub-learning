package com.abc.hublearning.web.exception_classes;

public class RestException extends RuntimeException {

    private long code;
    private String message;


    public RestException() {
    }

    public RestException(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
