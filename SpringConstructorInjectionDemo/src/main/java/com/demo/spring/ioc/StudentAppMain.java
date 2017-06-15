package com.demo.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.ioc.domain.Student;
import com.demo.spring.ioc.service.StudentService;


public class StudentAppMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService = (StudentService) applicationContext.getBean("studentService");
		studentService.insert(new Student());
	}

}
