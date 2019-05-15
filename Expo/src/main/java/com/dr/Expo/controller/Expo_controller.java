package com.dr.Expo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dr.Expo.dao.Expo_DAO;
import com.dr.Expo.model.Expo_Customer;

@RestController
public class Expo_controller {
	
	
	@Autowired
	private Expo_DAO dao;
	
	
	@RequestMapping(value="controller/aquireAllCustomers",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Expo_Customer>> aquireAllCustomers(){
		
		return new ResponseEntity<List<Expo_Customer>> (dao.getAll(),HttpStatus.OK);
		
		
		
	}
	
	@RequestMapping(value="controller/createCustomer",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> createCustomer(@RequestBody Expo_Customer ec)
	
	{
		dao.saved(ec);
		return new ResponseEntity<String>("New Customer Is Added",HttpStatus.CREATED);
	}
	
	@RequestMapping(value="controller/fetchCustomerById/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Expo_Customer> fetchCustomerById(@PathVariable("id")  int id)
	{
		
		Expo_Customer customer =dao.getById(id);
		if (customer!=null)
		return new ResponseEntity <Expo_Customer> (customer,HttpStatus.OK);
		else
			return new ResponseEntity <Expo_Customer>(HttpStatus.NO_CONTENT);
	}
	
	
	@RequestMapping(value="controller/updateCustomer/{id}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Expo_Customer> updateCustomer(@PathVariable("id") int id,@RequestBody Expo_Customer ec)
	{
		
		Expo_Customer customer =dao.getById(id);
		if (customer!=null)
			
		{	customer.getCustomer_address();
		customer.getCustomer_name();
		customer.getCustomer_dateOfOrder();
		
		return new ResponseEntity <Expo_Customer> (dao.updateById(ec),HttpStatus.OK);
		}
		else
		
			return new ResponseEntity <Expo_Customer>(HttpStatus.NO_CONTENT);
	}
	@RequestMapping(value="controller/deleteCustomer/{id}",method=RequestMethod.DELETE)
			public ResponseEntity<Expo_Customer> deleteCustomer(@PathVariable("id") int id)
			{
				Expo_Customer customer =dao.getById(id);
				if(customer!=null) {
					
					dao.deleteById(id);
					return new ResponseEntity("CUSTOMER ("+customer.getCustomer_name()+") IS DELETED",HttpStatus.OK);
				}
				else
					return new ResponseEntity(HttpStatus.NO_CONTENT);
						
			}
		
		
	}
	



