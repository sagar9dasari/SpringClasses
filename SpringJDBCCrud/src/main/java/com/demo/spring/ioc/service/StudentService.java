package com.demo.spring.ioc.service;

import java.util.List;

import com.demo.spring.ioc.domain.Student;

public interface StudentService {

	public Student getStudent(Student student);

	public List<Student> getAllStudents();

	public void insert(Student student);

	public void update(Student student);

	public void delete(Student student);
}
