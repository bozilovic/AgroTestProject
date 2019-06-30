package test.bozilovic.agroproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.bozilovic.agroproject.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
