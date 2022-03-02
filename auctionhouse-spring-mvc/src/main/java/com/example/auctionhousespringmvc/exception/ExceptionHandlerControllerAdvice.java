package com.example.auctionhousespringmvc.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.MediaType.APPLICATION_PROBLEM_JSON;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<Object> handleBusinessException(BusinessException e) {
        var headers = new HttpHeaders();
        headers.setContentType(APPLICATION_PROBLEM_JSON);
        return new ResponseEntity<>(
                new Problem(
                        BAD_REQUEST.value(),
                        BAD_REQUEST.name(),
                        e.getMessage()),
                headers, BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> handleNotFoundException(NotFoundException e) {
        var headers = new HttpHeaders();
        headers.setContentType(APPLICATION_PROBLEM_JSON);
        return new ResponseEntity<>(
                new Problem(
                        NOT_FOUND.value(),
                        NOT_FOUND.name(),
                        e.getMessage()),
                headers, NOT_FOUND);
    }


    /*@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException ex) {
        var headers = new HttpHeaders();
        headers.setContentType(APPLICATION_PROBLEM_JSON);

        var invalidFields = ex.getBindingResult().getFieldErrors().stream()
                .map(error -> new InvalidField(error.getField(), error.getDefaultMessage()))
                .toList();

        return new ResponseEntity<>(new BadRequestInvalidFieldsProblem(invalidFields), headers,
                BAD_REQUEST);
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<Object> handleNotFoundException(
            BusinessException ex) {
        var headers = new HttpHeaders();
        headers.setContentType(APPLICATION_PROBLEM_JSON);
        return new ResponseEntity<>(
                new Problem(
                        BAD_REQUEST.value(),
                        BAD_REQUEST.name(),
                        ex.getMessage()),
                headers,
                BAD_REQUEST);
    }


    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<Object> userNotFoundHandler(NullPointerException ex) {
        var headers = new HttpHeaders();
        headers.setContentType(APPLICATION_PROBLEM_JSON);
        return new ResponseEntity<>(
                new Problem(
                        NOT_FOUND.value(),
                        NOT_FOUND.name(),
                        ex.getMessage()), headers, NOT_FOUND);
    }*/
}
