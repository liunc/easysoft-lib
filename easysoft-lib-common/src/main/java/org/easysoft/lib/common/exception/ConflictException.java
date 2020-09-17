package org.easysoft.lib.common.exception;

public class ConflictException extends BusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3909740278183870309L;

	public ConflictException() {
		super();
	}

	public ConflictException(String message) {
		super(409, "Conflict", message);
	}

}
