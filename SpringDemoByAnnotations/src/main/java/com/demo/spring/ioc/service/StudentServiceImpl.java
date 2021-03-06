package com.demo.spring.ioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.demo.spring.ioc.dao.StudentDao;
import com.demo.spring.ioc.domain.Student;

@Service("studentService")
@Scope("prototype")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	@Qualifier("studentDao")
	private StudentDao studentDao ;
	
	public void sundayInit() {
		System.out.println("Init method");
	}
	
	public void sundayDestro() {
		System.out.println("Detroy method");
	}
	
	
	public void insert(Student student ) {
		studentDao.insert(student);
	}

}
