package com.demo.spring.ioc;

import com.demo.spring.ioc.domain.Student;
import com.demo.spring.ioc.service.StudentService;
import com.demo.spring.ioc.service.StudentServiceImpl;

public class StudentAppMain {

	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();
		service.insert(new Student());
	}

}
