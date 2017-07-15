package com.demo.spring.ioc.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.ioc.domain.Student;
import com.demo.spring.ioc.service.StudentService;

public class CrudTestMain {

	
	private static ApplicationContext applicationContext = null ;
	
	public static void main(String[] args) {
		
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml") ;
		// Getting Student Service from container
		StudentService studentService = (StudentService) applicationContext.getBean("studentService");
		
		Student goutham = new Student(1L, "Goutham", 789L) ;
		Student sai = new Student(2L, "Sai", 678L) ;
		
		//insertion
		studentService.insert(goutham);
		studentService.insert(sai);
		
		//get student record by number
		goutham = studentService.getStudent(goutham) ;
		System.out.println();
		System.out.println("Result from getStudent");
		System.out.println(goutham);
		
		//update student
		goutham.setTotalMarks(999L);
		studentService.update(goutham);
		
		//get All Student
		List<Student> students = studentService.getAllStudents() ;
		System.out.println();
		System.out.println("Result from getAllStudent");
		students.forEach(System.out::println);
		
		//delete student
		studentService.delete(goutham);
		studentService.delete(sai);

	}

}
