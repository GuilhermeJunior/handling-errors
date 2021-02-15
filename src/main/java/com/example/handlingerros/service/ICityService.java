package com.example.handlingerros.service;

import java.util.List;

import com.example.handlingerros.model.City;

public interface ICityService {
	
	City findById(Long id);
	City save(City city);
	List<City> findAll();
}
