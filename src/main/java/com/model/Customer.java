package com.model;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table
public class Customer {

    @Id@GeneratedValue
	private int customerId;

	private String customerName;
	private String contactNumber;
	private String customerAddress;
	private int pinCode;
	private String city;
	private String state;
    @Column(unique=true)
    private String emailId;
    @Column(unique=true)
    private String loginId;
	private String password;
	
	@OneToMany(mappedBy="customer")
	List<Orders> orders = new ArrayList<Orders>(); 
	

	public Customer() {		
		super();
	}

	

	public List<Orders> getOrders() {
		return orders;
	}



	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}



	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}



	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", customerAddress=" + customerAddress + ", pinCode=" + pinCode + ", city=" + city
				 + ", state=" + state + ", emailId=" + emailId + ", loginId=" + loginId
				+ ", password=" + password + "]";
	}

}
