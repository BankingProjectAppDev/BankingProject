package com.banking.banking.handler;

import com.banking.banking.error.ErrorDetail;
import com.banking.banking.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@ControllerAdvice
// allows handling exceptions across the whole application in one global handling component.
public class RestExceptionHandler {
    @ExceptionHandler(Exception.class)
    //an annotation used to handle the specific exceptions and sending the custom responses to the client.
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rnfe) {
       // ResponseEntity represents the whole HTTP response: status code, headers, and body.

        ErrorDetail errorDetail = new ErrorDetail();

        errorDetail.setCode(HttpStatus.NOT_FOUND.value());
        errorDetail.setMessage(rnfe.getMessage());
        // giving the error detail values

        return new ResponseEntity<>(errorDetail, null, HttpStatus.NOT_FOUND);
        // setting message to rnfe .get message it gets any message from the custom exception
        // returns reasoner entity  with  setting the error detail for the code to the value of the mot found value

    }





}
