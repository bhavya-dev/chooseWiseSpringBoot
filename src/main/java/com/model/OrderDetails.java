package com.model;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class OrderDetails {

	@Id@GeneratedValue
	private int orderDetailsId;
	//private int orderId;
	//private int productId;
	private int quantity;
	private double price;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	 Orders orders; //only 1 object

	@ManyToOne
	@JoinColumn(name="product_id")
	 Product product; //only 1 object

	public int getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(int orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}


}