package com.fr.admin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fr.admin.mapper.CityMapper;

@SpringBootApplication
public class AdminApplication implements CommandLineRunner {

	 private final CityMapper cityMapper;

	    public AdminApplication(CityMapper cityMapper) {
	        this.cityMapper = cityMapper;
	    }
	    
	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}
	
	 @Override
	    public void run(String... args) throws Exception {
	        System.out.println("city mapper callled " + this.cityMapper.findByState("CA"));
	    }
	

}
