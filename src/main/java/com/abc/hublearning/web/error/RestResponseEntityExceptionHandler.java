package com.abc.hublearning.web.error;

import com.abc.hublearning.web.exception_classes.ResourceNotFoundException;
import com.abc.hublearning.web.exception_classes.RestException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    public RestResponseEntityExceptionHandler() {
        super();
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    protected ResponseEntity<RestException> handleEntityNotFound (ResourceNotFoundException ex) {
        RestException restException = new RestException();
        restException.setMessage(ex.getMessage());
        restException.setCode(404L);
        return new ResponseEntity<RestException>(restException, HttpStatus.NOT_FOUND);
    }

}
