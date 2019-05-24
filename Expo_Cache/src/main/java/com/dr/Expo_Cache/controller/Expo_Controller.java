package com.dr.Expo_Cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dr.Expo_Cache.Model.Expo_Entity;
import com.dr.Expo_Cache.dao.Expo_DAO;


@RestController
public class Expo_Controller {
	
	@Autowired
	private Expo_DAO dao;
	
	@RequestMapping(value="controller/fetchCustomerById/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Expo_Entity> fetchCustomerById(@PathVariable("id")  int id)
	{
		
		Expo_Entity customer =dao.getById(id);
		if (customer!=null)
		return new ResponseEntity <Expo_Entity> (customer,HttpStatus.OK);
		else
			return new ResponseEntity <Expo_Entity>(HttpStatus.NO_CONTENT);
	}

}
