package com.test.hibernate.onetomany.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.hibernate.onetomany.domain.Person;

@Repository("personDao")
public class PersonDao implements IPersonDao {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Serializable insertPerson(Person person) {
		return getCurrentSession().save(person) ;
	}

	public Person getPerson(Long studentId) {
		return (Person) getCurrentSession().get(Person.class, studentId);
	}

	public List<Person> getAllPerson() {
		
		return (List<Person>) getCurrentSession().createCriteria(Person.class).list();
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
