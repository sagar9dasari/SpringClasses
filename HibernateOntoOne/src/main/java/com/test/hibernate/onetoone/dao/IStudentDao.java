package com.test.hibernate.onetoone.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.hibernate.onetoone.domain.Student;


public interface IStudentDao {

	public Serializable insertStudent(Student student);

	public Student getStudent(Long studentId);

	public List<Student> getAllStudent();
}
