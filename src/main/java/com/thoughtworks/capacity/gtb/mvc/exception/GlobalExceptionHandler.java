package com.thoughtworks.capacity.gtb.mvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;

/**
 * @Author: xqc
 * @Date: 2020/10/19 - 10 - 19 - 21:58
 * @Description: com.thoughtworks.capacity.gtb.mvc.exception
 * @version: 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DumplicatedUserException.class)
    public ResponseEntity<Error> handle(DumplicatedUserException e){
        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getError());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Error> handle(MethodArgumentNotValidException e){
        String message = e.getBindingResult().getFieldError().getDefaultMessage();
        Error error = new Error(400,message);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Error> handle(ConstraintViolationException ex){
        Set<ConstraintViolation<?>> violations = ex.getConstraintViolations();

        String message = "";
        for (ConstraintViolation<?> constraint : ex.getConstraintViolations()) {
            message = constraint.getMessage();
            break;
        }
        Error error = new Error(400,message);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
}
