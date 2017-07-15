package com.test.hibernate.onetoone.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.test.hibernate.onetoone.domain.Student;


public interface IStudentService {
	
	@Transactional(propagation = Propagation.REQUIRED)
	public Serializable insertStudent(Student student) ;
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public Student getStudent(long studentId) ;
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public List<Student> getAllStudent() ;
	

}
