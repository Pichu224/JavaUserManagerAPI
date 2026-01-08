package com.introToSpring.firstProyect.Exceptions.BussinessExceptions;

import org.springframework.http.HttpStatus;

public class EmailAlreadyExistsException extends ApiException {

    public EmailAlreadyExistsException(String email) {
        super("El email " + email + " ya está registrado", HttpStatus.CONFLICT);
    }
}
