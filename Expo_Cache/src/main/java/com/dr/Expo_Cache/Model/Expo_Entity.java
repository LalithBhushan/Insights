package com.dr.Expo_Cache.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "expo_customer")
public class Expo_Entity {
	

	@NotEmpty(message="{CustomerName.NonEmpty}")
	@Column(name="customer_name")
	private String customer_name;
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customer_id;
	
	@NotNull(message="{Address.Required}")
	@Column(name="customer_address")
	private String customer_address;
	
	@NotNull(message="Date.Required ")
	@Column(name="customer_dateOfOrder")
private Date customer_dateOfOrder;
	
	
	@NotNull
    
	 @Min(3)
	@Column(name="BillAmount")
	private int billAmount;


	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
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

@Override
public String toString() {
	return "Expo_Customer [customer_name=" + customer_name + ", customer_id=" + customer_id + ", customer_address="
			+ customer_address + ", customer_dateOfOrder=" + customer_dateOfOrder + ", billAmount=" + billAmount + "]";
}

public Expo_Entity() {
	super();
	// TODO Auto-generated constructor stub
}

public Expo_Entity(@NotEmpty(message = "{CustomerName.NonEmpty}") String customer_name, int customer_id,
		@NotNull(message = "{Address.Required}") String customer_address,
		@NotNull(message = "Date.Required ") Date customer_dateOfOrder, @NotNull @Min(3) int billAmount) {
	super();
	this.customer_name = customer_name;
	this.customer_id = customer_id;
	this.customer_address = customer_address;
	this.customer_dateOfOrder = customer_dateOfOrder;
	this.billAmount = billAmount;
}


	
}
