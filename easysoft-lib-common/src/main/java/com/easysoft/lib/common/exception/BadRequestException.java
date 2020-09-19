package com.easysoft.lib.common.exception;

public class BadRequestException extends BusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2312268125966964762L;

	public BadRequestException() {
		super();
	}

	public BadRequestException(String message) {
		super(400, "Bad Request", message);
	}

}
