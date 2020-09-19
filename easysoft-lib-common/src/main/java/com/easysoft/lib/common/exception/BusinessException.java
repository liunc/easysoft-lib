package com.easysoft.lib.common.exception;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 290602190709006945L;

	private int code;
	
	private String text;

	public int getCode() {
		return this.code;
	}
	
	public String getText() {
		return this.text;
	}

	public BusinessException() {
		super();
	}

	public BusinessException(int code, String text, String message) {
		super(message);
		this.code = code;
		this.text = text;
	}
}
