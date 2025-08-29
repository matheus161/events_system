package br.com.matheus161.events.controller;

import br.com.matheus161.events.dto.ErroDTO;
import br.com.matheus161.events.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(exception =  NotFoundException.class)
    public ResponseEntity<ErroDTO> handleNotFoundException(NotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErroDTO(ex.getMessage()));
    }
}
