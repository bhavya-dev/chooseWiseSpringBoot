package com.ts;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CustomerDao;
import com.model.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerDao customerDao;
	
	@PostMapping("/register")
	public void register(@RequestBody Customer customer) {
        System.out.println("controller"+customer);
		customerDao.register(customer);

	}

	@RequestMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() {
		List<Customer> customer = customerDao.getAllCustomers();
		return customer;
	}

	@RequestMapping("/getCustomerById/{customerId}")
	public Customer getCustomerById(@PathVariable("customerId") Integer customerId) {
		Customer customer = customerDao.getCustomerById(customerId);
		return customer;
	}

	@RequestMapping("/getCustomerByLoginId/{loginId}/{password}")
	public Customer getCustomerByLoginId(@PathVariable("loginId") String loginId,
			@PathVariable("password") String password) {
		Customer customer = customerDao.getCustomerByLoginId(loginId, password);
		return customer;
	}

	

}
