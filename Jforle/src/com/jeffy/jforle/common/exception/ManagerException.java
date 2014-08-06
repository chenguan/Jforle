package com.jeffy.jforle.common.exception;

public class ManagerException extends Exception {

	private static final long serialVersionUID = 1L;

	public ManagerException() {
		super();
	}

	public ManagerException(String message) {
		super(message);
	}

	public ManagerException(Throwable cause) {
		super(cause);
	}

	public ManagerException(String message, Throwable cause) {
		super(message, cause);
	}

}
