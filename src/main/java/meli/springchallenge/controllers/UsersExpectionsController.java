package meli.springchallenge.controllers;

import meli.springchallenge.dtos.ErrorDTO;
import meli.springchallenge.exceptions.SocialMeliException;
import meli.springchallenge.exceptions.UserNotValidException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UsersExpectionsController {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDTO> handleGlobalException(SocialMeliException e){
        return new ResponseEntity<>(e.getError(), e.getStatus());
    }
    @ExceptionHandler(UserNotValidException.class)
    public ResponseEntity<ErrorDTO> handleGlobalException(UserNotValidException e){
        return new ResponseEntity<>(e.getError(), e.getStatus());
    }

}
