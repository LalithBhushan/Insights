package com.dr.Expo_Cache.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.dr.Expo_Cache.Model.Expo_Entity;
import com.dr.Expo_Cache.repository.Expo_Repository;


@Repository
public class Expo_DAO {

	
	@Autowired
	private Expo_Repository repo;
	
	
	
	
	public List<Expo_Entity> getAll(){
		
		return repo.findAll();
	}
	
	public Expo_Entity saved(Expo_Entity ec) {
		return repo.save(ec);
	}
	
	@Cacheable(value="customer")
	public Expo_Entity getById(int id)
	{
		try {
			
			System.out.println("Go to sleep for 5 seconds as it is retriving from the cache ");
			 Thread.sleep(1000*5);
		}
		catch(InterruptedException e) {
			
			e.printStackTrace();
		}
		
		return repo.getOne(id);
	}
	
	
	public Expo_Entity updateById(Expo_Entity ec)
	{
		return repo.save(ec);
	}
	
	public void deleteById(int id)
	{
		repo.deleteById(id);
	}
}
