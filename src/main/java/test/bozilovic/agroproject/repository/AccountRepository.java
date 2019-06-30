package test.bozilovic.agroproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.bozilovic.agroproject.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
