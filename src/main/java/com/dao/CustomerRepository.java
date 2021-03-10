package com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	Optional<Customer> findByLoginIdAndPassword(String loginId, String password);

}
