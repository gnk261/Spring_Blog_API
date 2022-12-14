package com.springboot.blog.exception;

import org.aspectj.weaver.Iterators.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value =  HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private String resourceName;
	private String fieldName;
	private String fieldvalue;

	public ResourceNotFoundException(String resourceName, String fieldName, String fieldvalue) {
		super(String.format("%s not found with $s : '$s' ", resourceName, fieldName, fieldvalue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldvalue = fieldvalue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public String getFieldvalue() {
		return fieldvalue;
	}
	
	
	

}
