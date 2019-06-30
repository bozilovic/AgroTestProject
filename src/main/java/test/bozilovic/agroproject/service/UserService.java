package test.bozilovic.agroproject.service;

import java.util.List;

import test.bozilovic.agroproject.model.User;

public interface UserService {
	
	public List<User> getAllUsers();
	public User getUserbyId(Long id);
	public void deleteUserById(Long id);
	public void addUpdateUser();
}


