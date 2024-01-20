package com.yashw.app.exception.wrapper;

public class ProductNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ProductNotFoundException() {
		super();
	}
	
	public ProductNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ProductNotFoundException(String message) {
		super(message);
	}
	
	public ProductNotFoundException(Throwable cause) {
		super(cause);
	}
	
	
	
}










