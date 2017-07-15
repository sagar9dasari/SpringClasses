package com.krypto.test.dao;

import java.util.List;

import com.krypto.test.domain.Customer;

public interface ICustomerDao {
	public Customer getCustomers(Long cid) ;
	public List<Customer> getAllCustomer() ;
	public void insertCustomer(Customer customer) ;
	public void updateCustomer(Customer customer) ;
	public void deleteCustomer(Customer customer) ;
}
