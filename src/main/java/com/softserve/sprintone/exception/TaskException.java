package com.softserve.sprintone.exception;

public class TaskException extends RuntimeException{
    private final String message;

    public TaskException(final String message){
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
