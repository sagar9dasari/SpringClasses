package com.krypto.test.service;

import java.util.List;

import com.krypto.test.domain.Customer;

public interface ICustomerService {
	
	public Customer getCustomer(Long cid) ;
	public List<Customer> getAllCustomer() ;
	public void insertCustomer(Customer customer) ;
	public void updateCustomer(Customer customer) ;
	public void deleteCustomer(Customer customer) ;
	

}
