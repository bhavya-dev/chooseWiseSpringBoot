package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.OrderDetails;

@Service
public class OrderDetailsDAO {

	@Autowired
	OrderDetailsRepository orderDetailsRepository;
	
	public void myOrderDetails(List<OrderDetails> orderDetails) {
		 orderDetailsRepository.saveAll(orderDetails);

		
	}

	public List<OrderDetails> getMyOrderDetails() {
		List<OrderDetails> orderDetails=orderDetailsRepository.findAll();
		return orderDetails;

	}
	
	

}
