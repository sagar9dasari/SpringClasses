package com.demo.spring.ioc.service;

import com.demo.spring.ioc.dao.StudentDao;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao ;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	

}
