package com.example.error;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class IdNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(IdNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String idNotFoundHandler(IdNotFoundException ex) {
    return ex.getMessage();
  }
}
