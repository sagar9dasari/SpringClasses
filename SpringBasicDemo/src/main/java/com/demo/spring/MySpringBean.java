package com.demo.spring;

public class MySpringBean {

	private String message;

	public void printMessage() {
		System.out.println(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
