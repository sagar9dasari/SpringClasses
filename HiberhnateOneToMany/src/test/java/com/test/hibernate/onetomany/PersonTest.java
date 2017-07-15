package com.test.hibernate.onetomany;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.hibernate.onetomany.domain.Person;
import com.test.hibernate.onetomany.domain.Phone;
import com.test.hibernate.onetomany.service.IPersonService;

public class PersonTest {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("customer-app.xml");
		
		IPersonService service = (IPersonService) applicationContext.getBean("personService") ;
		
		Set<Phone> phoneNumbers = new HashSet<Phone>();
		
		phoneNumbers.add(new Phone("house","32354353"));
		phoneNumbers.add(new Phone("mobile","9889343423"));
		
		Person person1 = new Person("Eswar", phoneNumbers);
		
		Long pid = (Long) service.insertPerson(person1);
		
		Person person2 = service.getPerson(pid) ;
		
		List<Person> persons = service.getAllPerson() ;
		
		persons.forEach(p -> System.out.println(p));

	}

}
