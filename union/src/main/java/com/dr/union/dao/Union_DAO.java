package com.dr.union.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dr.union.model.Union_Entity;
import com.dr.union.repository.Union_Repository;

@Repository
public class Union_DAO {
	
	@Autowired
	private Union_Repository repo;
	
	
	public Union_Entity add(Union_Entity entity) {
		System.out.println(entity);
		return repo.save(entity);
	}
		public List<Union_Entity> getAllMemebers(){
			
			return repo.findAll();
		}
		
		public Union_Entity getEmployeeId(int id) {
		
			return repo.getOne(id);
			
			
		}
		
		public Union_Entity UpdateById(Union_Entity entity)
		{
			
			return repo.save(entity);
		}
		
		public void deleteMember(int id)
		{
			repo.deleteById(id);
		}
		
	}


