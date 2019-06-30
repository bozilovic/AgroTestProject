package test.bozilovic.agroproject.service;

import java.util.List;

import test.bozilovic.agroproject.model.Account;

public interface AccountService {

	public List<Account> findAllAccounts();
	public Account findAccountById(Long id);
	public void deleteAccountById(Long id);
	public void addUpdateAccount();
}
