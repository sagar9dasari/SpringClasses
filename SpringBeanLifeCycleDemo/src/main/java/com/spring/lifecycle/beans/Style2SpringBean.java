package com.spring.lifecycle.beans;

public class Style2SpringBean {

	public void myInit() {
		System.out.println("Style2SpringBean initialized");
	}

	public void myServiceMethod() {
		System.out.println("Style2SpringBean service method invoked");
	}

	public void myDestroy() {
		System.out.println("Style2SpringBean destroyed");
	}
}
