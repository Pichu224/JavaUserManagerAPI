package com.introToSpring.firstProyect.Exceptions;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.introToSpring.firstProyect.Exceptions.BussinessExceptions.ApiException;
import com.introToSpring.firstProyect.Infrastructure.Dtos.Error.ApiErrorDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ApiErrorDto> handleApiException(
            ApiException ex,
            HttpServletRequest request) {

        ApiErrorDto error = new ApiErrorDto(
                ex.getStatus().value(),
                ex.getMessage(),
                request.getRequestURI()
        );

        return ResponseEntity
                .status(ex.getStatus())
                .body(error);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiErrorDto> handleValidationErrors(
            MethodArgumentNotValidException ex,
            HttpServletRequest request) {

        String message = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(err -> "El " + err.getField() + " " + err.getDefaultMessage())
                .findFirst()
                .orElse("Datos inválidos");

        ApiErrorDto error = new ApiErrorDto(
                HttpStatus.BAD_REQUEST.value(),
                message,
                request.getRequestURI()
        );

        return ResponseEntity
                .badRequest()
                .body(error);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ApiErrorDto> handleInvalidJson(
            HttpMessageNotReadableException ex,
            HttpServletRequest request) {

        Throwable cause = ex.getMostSpecificCause();

        String message = "JSON inválido";

        if (cause instanceof UnrecognizedPropertyException e) {
            message = "Campo no reconocido: " + e.getPropertyName();
        }

        ApiErrorDto error = new ApiErrorDto(
                HttpStatus.BAD_REQUEST.value(),
                message,
                request.getRequestURI()
        );

        return ResponseEntity
                .badRequest()
                .body(error);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiErrorDto> handleGenericException(
            Exception ex,
            HttpServletRequest request) {

        ApiErrorDto error = new ApiErrorDto(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Error interno del servidor",
                request.getRequestURI()
        );

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(error);
    }
}
