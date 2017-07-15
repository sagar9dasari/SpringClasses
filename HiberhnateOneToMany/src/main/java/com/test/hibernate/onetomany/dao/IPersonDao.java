package com.test.hibernate.onetomany.dao;

import java.io.Serializable;
import java.util.List;

import com.test.hibernate.onetomany.domain.Person;


public interface IPersonDao {

	public Serializable insertPerson(Person student);

	public Person getPerson(Long studentId);

	public List<Person> getAllPerson();
}
