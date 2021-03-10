//package com.dao;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.model.Orders;
//import com.model.Product;
//
//@Service
//public class OrdersDao {
//
//    @Autowired
//    OrdersRepository ordersRepository;
//	public void myOrders(List<Orders> orders) {
//		
//		 ordersRepository.saveAll(orders);
//
//	}
//	public List<Orders> getMyOrders() {
//		List<Orders> orders=ordersRepository.findAll();
//		return orders;
//
//	}
//
//}
