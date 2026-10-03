package com.unitedairways.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import jakarta.validation.Valid;

import com.unitedairways.payload.CityRequest;
import com.unitedairways.payload.CityResponse;
import com.unitedairways.service.CityServiceInterface;

@RestController
@RequestMapping("/location")

public class HomeController {

	private final CityServiceInterface cityService;
	
	public HomeController(CityServiceInterface cityService){
		this.cityService=cityService;
	}
	
	@PostMapping("/createlocation")
	public ResponseEntity<CityResponse> createLocation(@Valid @RequestBody CityRequest cityRequest) {
		CityResponse createdCity = cityService.createCity(cityRequest);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdCity);
	}

	@GetMapping("/getlocation/{id}")
	public ResponseEntity<CityResponse> getLocation(@PathVariable Long id) {
		CityResponse city = cityService.getCityById(id);
		if (city == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "City with id " + id + " not found");
		}
		return ResponseEntity.ok(city);
	}

}
