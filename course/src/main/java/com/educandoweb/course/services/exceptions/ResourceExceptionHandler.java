package com.educandoweb.course.services.exceptions;

public class ResourceExceptionHandler extends RuntimeException {
    public ResourceExceptionHandler(String message) {
        super(message);
    }
}
