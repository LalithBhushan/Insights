package com.dr.union.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="union_table")
public class Union_Entity {
	
	
	@Column(name="name")
	private String name;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="email")
	 private String email;
	
	
	public Union_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Union_Entity(String name, int id, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	@Override
	public String toString() {
		return "Union_Entity [name=" + name + ", id=" + id + ", email=" + email + "]";
	}
	 	 


}
