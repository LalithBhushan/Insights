package com.dr.Expo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.dr.Expo.model.Expo_Customer;
import com.dr.Expo.repository.Expo_Repository;


@Repository
public class Expo_DAO {

	
	@Autowired
	private Expo_Repository repo;
	
	
	@Cacheable(value="customerCacheSpace")
	public List<Expo_Customer> getAll(){
		
		return repo.findAll();
	}
	
	public Expo_Customer saved(Expo_Customer ec) {
		return repo.save(ec);
	}
	
	public Expo_Customer getById(int id)
	{
		return repo.getOne(id);
	}
	
	
	public Expo_Customer updateById(Expo_Customer ec)
	{
		return repo.save(ec);
	}
	
	public void deleteById(int id)
	{
		repo.deleteById(id);
	}
	
}
