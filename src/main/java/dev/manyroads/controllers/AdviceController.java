package dev.manyroads.controllers;

import dev.manyroads.exceptions.TestIOException;
import dev.manyroads.model.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AdviceController {

    @ExceptionHandler(TestIOException.class)
    public ResponseEntity<ErrorDetails> adviceHandler() {

        System.out.println("In adviceHandler");

        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setErrorMessage("Foutje !!");
        errorDetails.setErrorMessage2("Foutje 2 !!");

        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
