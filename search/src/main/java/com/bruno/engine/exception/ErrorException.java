package com.bruno.engine.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class ErrorException extends RuntimeException{
	public ErrorException(String error){
		super(error);
	}
}
