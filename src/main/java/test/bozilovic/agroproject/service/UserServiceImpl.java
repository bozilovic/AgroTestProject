package test.bozilovic.agroproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.bozilovic.agroproject.model.User;
import test.bozilovic.agroproject.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;
	
	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public User getUserbyId(Long id) {
		return repository.getOne(id);
	}

	@Override
	public void deleteUserById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public void addUpdateUser() {
		repository.save(new User());
	}

}
