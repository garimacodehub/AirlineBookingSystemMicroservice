package com.unitedairways.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unitedairways.payload.ApiResponse;

@RestController
public class HomeController {
	
	@GetMapping()
	public ApiResponse HomeController() {
		ApiResponse response = new ApiResponse();
		response.setMessage("Hello everyone in loxation service of airline microservice");
		return response;
	}

}
