package com.dr.Expo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dr.Expo.model.Expo_Customer;

public interface Expo_Repository extends JpaRepository<Expo_Customer, Integer> {
	
	
}
