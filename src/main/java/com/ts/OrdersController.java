//package com.ts;
//
//import java.util.List;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.dao.OrdersDao;
//import com.model.Orders;
//
//@RestController
//public class OrdersController {
//
//	@Autowired
//	OrdersDao ordersDao;
//	
//	@PostMapping("/myOrders")
//	public void myOrders(@RequestBody List<Orders> orders) {
//        System.out.println("orderscontroller"+orders);
//		ordersDao.myOrders(orders);
//
//	}
//	@RequestMapping("/getMyOrders")
//	public List<Orders> getMyOrders() {
//		List<Orders> orders = ordersDao.getMyOrders();
//        System.out.println("ordersgetting"+orders);
//
//		return orders;
//	}
//
//
//
//
//}
