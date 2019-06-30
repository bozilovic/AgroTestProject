package test.bozilovic.agroproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.bozilovic.agroproject.model.Customer;
import test.bozilovic.agroproject.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;
	
	@Override
	public List<Customer> getAllCustomers() {
		return repository.findAll();
	}

	@Override
	public Customer getCustomerById(Long id) {
		return repository.getOne(id);
	}

	@Override
	public void deleteCustomerById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public void addUpdateCustomer() {
		repository.save(new Customer());
	}

}
