package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentAppMain {

	private static ApplicationContext context = new ClassPathXmlApplicationContext(
			"applicationContext.xml");

	public static void main(String[] args) {
		MySpringBean springBean = (MySpringBean) context.getBean("springBean");
		springBean.printMessage();
	}

}
