package com.spring.lifecycle.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Style1SpringBean implements InitializingBean, DisposableBean {

	public void destroy() throws Exception {
		System.out.println("Style1SpringBean destroyed");

	}

	public void beanMethod() {
		System.out.println("Style1SpringBean service method called");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Style1SpringBean initialized");

	}

}
