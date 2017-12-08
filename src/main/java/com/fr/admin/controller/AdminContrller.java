package com.fr.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fr.admin.service.AdminService;

@RestController("/")
public class AdminContrller {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private ObjectMapper objectMapper ;
	
	@ResponseBody
	@RequestMapping("/hello")
	public String sayHello() throws JsonProcessingException {
		return objectMapper.writeValueAsString(adminService.getCity("CA"));
	}

}
