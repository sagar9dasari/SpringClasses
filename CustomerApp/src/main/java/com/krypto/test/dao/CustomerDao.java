package com.krypto.test.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.krypto.test.domain.Customer;

@Repository("customerDao")
public class CustomerDao implements ICustomerDao {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void insertCustomer(Customer customer) {
		getCurrentSession().save(customer);
	}

	public void updateCustomer(Customer customer) {
		getCurrentSession().update(customer);
	}

	public List<Customer> getAllCustomer() {
		List<Customer> custList = new ArrayList<Customer>();
		Criteria criteria = getCurrentSession().createCriteria(Customer.class);
		custList = criteria.list();
		return custList;
	}

	public void deleteCustomer(Customer customer) {
		getCurrentSession().delete(customer);

	}

	public Customer getCustomers(Long cid) {
		Customer customer = (Customer) getCurrentSession().get(Customer.class,
				cid);
		return customer;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
