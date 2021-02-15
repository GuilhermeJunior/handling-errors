package com.example.handlingerros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.handlingerros.exception.CityNotFoundException;
import com.example.handlingerros.exception.NoDataFoundException;
import com.example.handlingerros.model.City;
import com.example.handlingerros.repository.CityRepository;

@Service
public class CityService implements ICityService {
	
	@Autowired
	private CityRepository cityRepository;

	@Override
	public City findById(Long id) {
		
		return cityRepository.findById(id)
				.orElseThrow(() -> new CityNotFoundException(id));
	}

	@Override
	public City save(City city) {
		
		return cityRepository.save(city);
	}

	@Override
	public List<City> findAll() {
		
		List<City> cities = (List<City>) cityRepository.findAll();
		
		if(cities.isEmpty()) {
			throw new NoDataFoundException();
		}
		return null;
	}
	
	
}
