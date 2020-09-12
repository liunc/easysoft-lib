package org.easysoft.lib.common;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 290602190709006945L;

	public BusinessException() {
		super();
	}

	public BusinessException(String message) {
		super(message);
	}
}
