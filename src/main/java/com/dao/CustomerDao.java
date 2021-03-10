package com.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Customer;

@Service
public class CustomerDao {

	@Autowired
	CustomerRepository customerRepository;
	
	public void register(Customer customer) {
		System.out.println("before save"+customer);
		customerRepository.save(customer);
		System.out.println("dao"+customer);
	}

	public Customer getCustomerByLoginId(String loginId, String password) {
		Customer customer = customerRepository.findByLoginIdAndPassword(loginId,password).orElse(new Customer());
		return customer;
		
	}

	public Customer getCustomerById(Integer customerId) {
		Customer customer = customerRepository.findById(customerId).orElse(new Customer());
		return customer;

	}

	public List<Customer> getAllCustomers() {
		List<Customer> customer=customerRepository.findAll(); 
		 
		return customer;
	
		}

}
