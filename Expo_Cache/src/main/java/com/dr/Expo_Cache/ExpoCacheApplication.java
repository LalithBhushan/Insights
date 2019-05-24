package com.dr.Expo_Cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ExpoCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpoCacheApplication.class, args);
	}

}
