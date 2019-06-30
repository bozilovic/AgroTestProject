package test.bozilovic.agroproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import test.bozilovic.agroproject.model.User;

@Service
public class LoginService {

	public User validateUsername(String username, List<User> users) {
		User user = users.stream().filter(u -> u.getUsername().equals(username)).findAny().get();
		return user;
	}
	
	public boolean validatePassword(String password, User user) {
		if(!password.equals(user.getPassword())) {
			return false;
		}
		return true;
	}
}
