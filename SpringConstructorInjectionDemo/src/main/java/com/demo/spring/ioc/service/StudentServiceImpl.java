package com.demo.spring.ioc.service;

import com.demo.spring.ioc.dao.StudentDao;
import com.demo.spring.ioc.domain.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;

	public StudentServiceImpl(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void insert(Student student) {
		studentDao.insert(student);
	}
}
