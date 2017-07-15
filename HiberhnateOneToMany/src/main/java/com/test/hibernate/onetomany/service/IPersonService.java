package com.test.hibernate.onetomany.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.test.hibernate.onetomany.domain.Person;


public interface IPersonService {
	
	@Transactional(propagation = Propagation.REQUIRED)
	public Serializable insertPerson(Person person) ;
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public Person getPerson(long pid) ;
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public List<Person> getAllPerson() ;
	

}
