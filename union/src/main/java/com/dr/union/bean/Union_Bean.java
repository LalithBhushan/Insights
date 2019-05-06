package com.dr.union.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Union_Bean {
	
	
	private String name;
	
	
	private int id;
	
	 private String mail;

	public Union_Bean(String name, int id, String mail) {
		super();
		this.name = name;
		this.id = id;
		this.mail = mail;
	}

	public Union_Bean() {
		super();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	

}
