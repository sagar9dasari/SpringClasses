package com.test.hibernate.onetoone;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.hibernate.onetoone.domain.Address;
import com.test.hibernate.onetoone.domain.Student;
import com.test.hibernate.onetoone.service.IStudentService;

public class StudentTest {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("customer-app.xml");
		
		IStudentService service = (IStudentService) applicationContext.getBean("studentService") ;
		
		List<Student> students = service.getAllStudent() ;
		students.forEach(student -> System.out.println(student));
		
		
		/*Address address1 = new Address("OMR Road", "Chennai", "TN", "600097");
		Address address2 = new Address("Ring Road", "Banglore", "Karnataka", "560000");
		
		Student student1 = new Student("Goutham", address1);
		Student student2 = new Student("Sai", address2);
		
		Long id1 = (Long) service.insertStudent(student1);
		Long id2 = (Long) service.insertStudent(student2);*/
		
		/*System.out.println(service.getStudent(id1));
		System.out.println(service.getStudent(id2));
		System.out.println();
		System.out.println();
		
		*/

	}

}
