package com.test.hibernate.onetoone.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.test.hibernate.onetoone.dao.IStudentDao;
import com.test.hibernate.onetoone.domain.Student;

@Service("studentService")
public class StudentService implements IStudentService {
	
	@Autowired
	@Qualifier("studentDao")
	private IStudentDao studentDao ;

	@Override
	public Serializable insertStudent(Student student) {
		return studentDao.insertStudent(student);
		
	}

	@Override
	public Student getStudent(long studentId) {
		return studentDao.getStudent(studentId);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentDao.getAllStudent();
	}

}
