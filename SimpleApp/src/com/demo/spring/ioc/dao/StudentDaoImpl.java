package com.demo.spring.ioc.dao;

import com.demo.spring.ioc.domain.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void insert(Student student) {
		System.out.println("Student Inserted into DB..");
		
	}

}
