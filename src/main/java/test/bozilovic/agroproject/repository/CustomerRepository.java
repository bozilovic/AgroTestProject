package test.bozilovic.agroproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.bozilovic.agroproject.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
