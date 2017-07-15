package com.krypto.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.krypto.test.dao.CustomerDao;
import com.krypto.test.domain.Customer;

@Component("customerService")
public class CustomerService implements ICustomerService {

	@Autowired
	@Qualifier("customerDao")
	private CustomerDao customerDao;

	@Transactional(propagation = Propagation.REQUIRED)
	public void insertCustomer(Customer customer) {
		customerDao.insertCustomer(customer);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public Customer getCustomer(Long cid) {
		return customerDao.getCustomers(cid);

	}

	@Transactional(propagation = Propagation.REQUIRED)
	public List<Customer> getAllCustomer() {
		return customerDao.getAllCustomer();

	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);

	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void deleteCustomer(Customer customer) {
		customerDao.deleteCustomer(customer);

	}
}
