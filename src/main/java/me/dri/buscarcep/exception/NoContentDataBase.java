package me.dri.buscarcep.exception;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class NoContentDataBase {

    @ExceptionHandler(CepNullContent.class)
    public ResponseEntity<StandardError> resourceNotFound(CepNullContent e) {
        String error = "Cep é nulo";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(JsonFormatException.class)
    public ResponseEntity<StandardError> jsonFormatError(JsonFormatException e, HttpServletRequest request) {
        String error = "Formato não permitido";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage());
        return ResponseEntity.status(status).body(err);
    }
}
