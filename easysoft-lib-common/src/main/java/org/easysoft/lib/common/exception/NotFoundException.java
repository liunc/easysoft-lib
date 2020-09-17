package org.easysoft.lib.common.exception;

public class NotFoundException extends BusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7851676199416181466L;

	public NotFoundException() {
		super();
	}

	public NotFoundException(String message) {
		super(404, "Not Found", message);
	}

}
