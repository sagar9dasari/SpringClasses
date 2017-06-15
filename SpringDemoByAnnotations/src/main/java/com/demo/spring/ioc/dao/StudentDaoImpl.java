package com.demo.spring.ioc.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.demo.spring.ioc.domain.Student;

@Repository
@Qualifier("studentDao")
public class StudentDaoImpl implements StudentDao {

	public void insert(Student student) {
		System.out.println("Student inserted into DB");
	}

}
