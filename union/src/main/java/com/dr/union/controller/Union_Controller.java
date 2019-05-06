package com.dr.union.controller;

import java.util.ArrayList;
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

import com.dr.union.dao.Union_DAO;
import com.dr.union.model.Union_Entity;

@RestController
public class Union_Controller {
	
	@Autowired
	private Union_DAO dao;
	
	@RequestMapping(value="/union/controller/addUnionMembers",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> addUnionMemebrs(@RequestBody Union_Entity entity){
		
		dao.add(entity);
		return new ResponseEntity<String>("Member is Successfully added in Unioin",HttpStatus.OK);
		
	}
	@RequestMapping(value="/union/controller/getAllMembers",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Union_Entity>> getAllMembers(){
		List<Union_Entity> list=new ArrayList<Union_Entity>(dao.getAllMemebers());
		
		return new ResponseEntity<List<Union_Entity>>(list,HttpStatus.OK);
		
	
	}

	@RequestMapping(value="/union/controller/getMemberById/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Union_Entity> getMemeberById(@PathVariable("id") int id )
	{
		Union_Entity entity =dao.getEmployeeId(id);
		
		if(entity==null) {
			
			return new ResponseEntity<Union_Entity>(HttpStatus.NO_CONTENT);
		}
		else
			return new ResponseEntity<Union_Entity>(entity,HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/union/controller/updateById/{id}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Union_Entity> updateById(@PathVariable("id") int id,@RequestBody Union_Entity requestEntity)
{
	
	Union_Entity entity=dao.getEmployeeId(id);
	if(entity !=null)
	{
		entity.setName(requestEntity.getName());
		entity.setEmail(requestEntity.getEmail());
	return new ResponseEntity<Union_Entity>(dao.UpdateById(entity),HttpStatus.OK);	
	}
	return new ResponseEntity<Union_Entity>(HttpStatus.NOT_MODIFIED);
	
}
	
}
