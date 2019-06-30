package test.bozilovic.agroproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import test.bozilovic.agroproject.service.CustomerServiceImpl;

@Controller
public class CustomerController {

private CustomerServiceImpl service;
	
	@Autowired
	public CustomerController(CustomerServiceImpl service) {
		this.service = service;
	}
	
	@GetMapping("/customers")
	public ResponseEntity<Object> getCustomers() {
		return new ResponseEntity<>(service.getAllCustomers(), HttpStatus.OK);
	}
}
