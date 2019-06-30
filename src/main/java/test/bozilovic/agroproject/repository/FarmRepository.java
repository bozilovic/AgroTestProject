package test.bozilovic.agroproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.bozilovic.agroproject.model.Farm;

public interface FarmRepository extends JpaRepository<Farm, Long>{

}
