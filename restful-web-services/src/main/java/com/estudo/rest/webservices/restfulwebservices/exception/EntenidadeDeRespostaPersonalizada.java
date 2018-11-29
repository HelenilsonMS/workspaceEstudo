package com.estudo.rest.webservices.restfulwebservices.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.estudo.rest.webservices.restfulwebservices.UserNotFoundException;

@ControllerAdvice
@RestController
public class EntenidadeDeRespostaPersonalizada extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions
	(Exception ex, WebRequest request){
		ExceptionDeResposta exceptionResposta = new  ExceptionDeResposta(new Date(), ex.getMessage(), request.getDescription(false));
	
		return new ResponseEntity(exceptionResposta, HttpStatus.INTERNAL_SERVER_ERROR);
	
	}
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> UserNotFoundException
	(UserNotFoundException ex, WebRequest request){
		ExceptionDeResposta exceptionResposta = new  ExceptionDeResposta(new Date(), ex.getMessage(), request.getDescription(false));
	
		return new ResponseEntity(exceptionResposta, HttpStatus.NOT_FOUND);
	
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
		
		MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		ExceptionDeResposta exceptionResposta = new  ExceptionDeResposta(new Date(), "Erro na validação", ex.getBindingResult().toString());
	
		return new ResponseEntity(exceptionResposta, HttpStatus.BAD_REQUEST);
	}
}
