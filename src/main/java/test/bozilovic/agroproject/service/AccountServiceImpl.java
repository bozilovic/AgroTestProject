package test.bozilovic.agroproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.bozilovic.agroproject.model.Account;
import test.bozilovic.agroproject.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepository repository;

	@Override
	public List<Account> findAllAccounts() {
		return repository.findAll();
	}

	@Override
	public Account findAccountById(Long id) {
		return repository.getOne(id);
	}

	@Override
	public void deleteAccountById(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public void addUpdateAccount() {
		repository.save(new Account());		
	}

	

}
