package com.example.handlingerros.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.handlingerros.model.City;
import com.example.handlingerros.service.ICityService;

@RestController
public class CityController {
	
	@Autowired
	private ICityService cityService;
	
	@GetMapping(value = "/cities/{id}")
	public City getCity(@PathVariable Long id) {
		return cityService.findById(id);
	}
	
	@PostMapping(value = "/cities", consumes = MediaType.APPLICATION_JSON_VALUE,
			           produces = MediaType.APPLICATION_JSON_VALUE)
	public City createCity(@RequestBody @Valid City city) {
		
		return cityService.save(city);
	}
	
	@GetMapping(value = "/cities")
	public List<City> findAll(){
		
		return cityService.findAll();
	}
}
