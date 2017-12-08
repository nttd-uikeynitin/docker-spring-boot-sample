package com.fr.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.admin.mapper.City;
import com.fr.admin.mapper.CityMapper;
import com.fr.admin.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private CityMapper cityMapper;
	 
	@Override
	public City getCity(String city) {
		return this.cityMapper.findByState(city);
	}

}
