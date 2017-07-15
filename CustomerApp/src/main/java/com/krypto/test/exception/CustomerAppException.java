package com.krypto.test.exception;

public class CustomerAppException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3472803317668202797L;

	private String exMsg = null;

	public CustomerAppException() {
		super();
	}

	public CustomerAppException(String msg) {
		super(msg);
		this.exMsg = msg;
	}
}
