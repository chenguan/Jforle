package com.jeffy.jforle.common.exception;

public class CommonException extends Exception {

	private static final long serialVersionUID = 1L;

	public CommonException() {
		super();
	}

	public CommonException(String message) {
		super(message);
	}

	public CommonException(Throwable cause) {
		super(cause);
	}

	public CommonException(String message, Throwable cause) {
		super(message, cause);
	}

}
