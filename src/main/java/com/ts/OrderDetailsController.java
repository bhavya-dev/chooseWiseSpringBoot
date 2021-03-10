package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.OrderDetailsDAO;
import com.model.OrderDetails;


@RestController
public class OrderDetailsController {

	@Autowired
	OrderDetailsDAO orderDetailsDao;
	
	@PostMapping("/myOrderDetails")
	public void myOrderDetails(@RequestBody List<OrderDetails> orderDetails) {
        System.out.println("orderscontroller"+orderDetails);
		orderDetailsDao.myOrderDetails(orderDetails);

	}
	
	@RequestMapping("/getMyOrderDetails")
	public List<OrderDetails> getMyOrderDetails() {
		List<OrderDetails> orderDetails = orderDetailsDao.getMyOrderDetails();
        System.out.println("orderdetailsgetting"+orderDetails);

		return orderDetails;
	}


}
