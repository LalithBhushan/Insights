package com.dr.Expo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Expo_Customer {
	
	@Column(name="customer_name")
	private String customer_name;
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customer_id;
	
	@Column(name="customer_address")
	private String customer_address;
	
	@Column(name="customer_dateOfOrder")
private Date customer_dateOfOrder;

public Expo_Customer() {
	super();
	// TODO Auto-generated constructor stub
}

public String getCustomer_name() {
	return customer_name;
}

public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
}

public int getCustomer_id() {
	return customer_id;
}

public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
}

public String getCustomer_address() {
	return customer_address;
}

public void setCustomer_address(String customer_address) {
	this.customer_address = customer_address;
}

public Date getCustomer_dateOfOrder() {
	return customer_dateOfOrder;
}

public void setCustomer_dateOfOrder(Date customer_dateOfOrder) {
	this.customer_dateOfOrder = customer_dateOfOrder;
}

public Expo_Customer(String customer_name, int customer_id, String customer_addres, Date customer_dateOfOrder) {
	super();
	this.customer_name = customer_name;
	this.customer_id = customer_id;
	this.customer_address = customer_addres;
	this.customer_dateOfOrder = customer_dateOfOrder;
}

@Override
public String toString() {
	return "Expo_Customer [customer_name=" + customer_name + ", customer_id=" + customer_id + ", customer_addres="
			+ customer_address + ", customer_dateOfOrder=" + customer_dateOfOrder + "]";
}


}
