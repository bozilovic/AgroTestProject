package test.bozilovic.agroproject.service;

import java.util.List;

import test.bozilovic.agroproject.model.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomers();
	public Customer getCustomerById(Long id);
	public void deleteCustomerById(Long id);
	public void addUpdateCustomer();
	}
