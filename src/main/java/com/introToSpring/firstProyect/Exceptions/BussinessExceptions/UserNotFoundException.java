package com.introToSpring.firstProyect.Exceptions.BussinessExceptions;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends ApiException {

    public UserNotFoundException(Long id) {
        super("Usuario con id " + id + " no encontrado", HttpStatus.NOT_FOUND);
    }
}
