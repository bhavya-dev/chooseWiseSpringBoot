package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Orders {
	
	@Id@GeneratedValue
	private int orderId;
	private String orderType;
	//private int customerId;
	private String orderStatus;
	private Date orderDate;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	Customer customer;
	
	@OneToMany(mappedBy="orders")
	List<OrderDetails> orderDetails=new ArrayList<OrderDetails>();

	public Orders() {
		super();
	}

	

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

//	public int getCustomerId() {
//		return customerId;
//	}
//
//	public void setCustomerId(int customerId) {
//		this.customerId = customerId;
//	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

//	@Override
//	public String toString() {
//		return "Order [orderId=" + orderId + ", orderType=" + orderType + ", customerId=" + customerId
//				+ ", orderStatus=" + orderStatus + ", orderDate=" + orderDate + "]";
//	}



}
