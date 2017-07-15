package com.demo.spring.ioc.dao;

import java.util.List;

import com.demo.spring.ioc.domain.Student;

public interface StudentDao {
	public Student getStudent(Student student);

	public List<Student> getAllStudents();

	public void insert(Student student);

	public void update(Student student);

	public void delete(Student student);
}
