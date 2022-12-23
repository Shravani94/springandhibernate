package com.techouts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.techouts.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
