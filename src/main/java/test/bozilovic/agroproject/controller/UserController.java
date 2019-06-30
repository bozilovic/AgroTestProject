package test.bozilovic.agroproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import test.bozilovic.agroproject.service.UserServiceImpl;

@Controller
public class UserController {

	private UserServiceImpl service;
	
	@Autowired
	public UserController(UserServiceImpl service) {
		this.service = service;
	}
	
	@GetMapping("/users")
	public ResponseEntity<Object> getUsers() {
		return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
	}
}
