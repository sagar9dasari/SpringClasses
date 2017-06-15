package com.demo.spring.ioc.service;

import com.demo.spring.ioc.dao.StudentDao;
import com.demo.spring.ioc.dao.StudentDaoImpl;
import com.demo.spring.ioc.domain.Student;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao = new StudentDaoImpl() ;

	@Override
	public void insert(Student student) {
		studentDao.insert(student);
		
	}

	
	
	

}
