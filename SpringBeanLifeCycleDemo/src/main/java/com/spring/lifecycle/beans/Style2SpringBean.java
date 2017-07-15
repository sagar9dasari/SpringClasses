package com.spring.lifecycle.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Style2SpringBean {

	@PostConstruct
	public void myInit() {
		System.out.println("Style2SpringBean initialized");
	}

	public void myServiceMethod() {
		System.out.println("Style2SpringBean service method invoked");
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("Style2SpringBean destroyed");
	}
}
