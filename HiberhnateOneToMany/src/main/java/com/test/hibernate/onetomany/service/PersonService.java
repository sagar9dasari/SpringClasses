package com.test.hibernate.onetomany.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.test.hibernate.onetomany.dao.IPersonDao;
import com.test.hibernate.onetomany.domain.Person;

@Service("personService")
public class PersonService implements IPersonService {
	
	@Autowired
	@Qualifier("personDao")
	private IPersonDao personDao ;

	public Serializable insertPerson(Person person) {
		return personDao.insertPerson(person);
	}

	public Person getPerson(long pid) {
		return personDao.getPerson(pid);
	}

	public List<Person> getAllPerson() {
		return personDao.getAllPerson();
	}

	

}
