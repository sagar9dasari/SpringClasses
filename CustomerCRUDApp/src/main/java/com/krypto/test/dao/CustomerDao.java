package com.krypto.test.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
		Session session = getCurrentSession();
		session.save(customer);
	}

	public void updateCustomer(Customer customer) {
		getCurrentSession().saveOrUpdate(customer);
		customer = new Customer(customer.getCid(),"Hi",123L,"ABH");
		getCurrentSession().merge(customer);
	}
	
	public void mergeCustomer(Customer customer) {
		getCurrentSession().merge(customer);
	}

	public List<Customer> getAllCustomer() {
		List<Customer> custList = new ArrayList<Customer>();
		Criteria criteria = getCurrentSession().createCriteria(Customer.class);
		custList = criteria.list();
		return custList;
	}
	
	public void test(Customer customer) {
		customer = getCustomers(customer.getCid());// Persistent
	System.out.println("Before evict "+getCurrentSession().contains(customer));
	getCurrentSession().evict(customer); // Detatched
	System.out.println("After evict "+getCurrentSession().contains(customer));
	getCurrentSession().refresh(customer); // Persistent
	//System.out.println("After refreash "+getCurrentSession().contains(customer));
	//getCurrentSession().persist(customer);
	getCurrentSession().clear();// deta
	
	}
	
	
	public void deleteCustomer(Customer customer) {
		getCurrentSession().delete(customer);
		getCurrentSession().evict(customer);

	}

	public Customer getCustomers(Long cid) {
		Customer customer = (Customer) getCurrentSession().get(Customer.class,cid);
		customer.getCid();
		return customer;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
