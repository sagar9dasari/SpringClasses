package com.demo.spring.ioc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.ioc.dao.StudentDao;
import com.demo.spring.ioc.domain.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	public Student getStudent(Student student) {
		return studentDao.getStudent(student);

	}

	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	public void insert(Student student) {
		studentDao.insert(student);

	}

	public void update(Student student) {
		studentDao.update(student);

	}

	public void delete(Student student) {
		studentDao.delete(student);

	}

}
