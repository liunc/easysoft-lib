package com.easysoft.lib.common.exception;

public class GoneException extends BusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3909740278183870309L;

	public GoneException() {
		super();
	}

	public GoneException(String message) {
		super(410, "Gone", message);
	}

}