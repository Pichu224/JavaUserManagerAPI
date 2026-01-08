package com.introToSpring.firstProyect.Infrastructure.Dtos.Error;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ApiErrorDto {

    private final int status;
    private final String message;
    private final String path;
    private final LocalDateTime timestamp;

    public ApiErrorDto(int status, String message, String path) {
        this.status = status;
        this.message = message;
        this.path = path;
        this.timestamp = LocalDateTime.now();
    }
}
