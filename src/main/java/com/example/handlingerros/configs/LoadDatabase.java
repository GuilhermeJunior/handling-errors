package com.example.handlingerros.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.handlingerros.model.City;
import com.example.handlingerros.repository.CityRepository;

@Component
public class LoadDatabase implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(LoadDatabase.class);

	@Autowired
	private CityRepository cityRepository;
	
	@Override
	public void run(String... args) throws Exception {

		logger.info("saving cities");
		
		  cityRepository.save(new City("Bratislava", 432000));
	        cityRepository.save(new City("Budapest", 1759000));
	        cityRepository.save(new City("Prague", 1280000));
	        cityRepository.save(new City("Warsaw", 1748000));
	        cityRepository.save(new City("Los Angeles", 3971000));
	        cityRepository.save(new City("New York", 8550000));
	        cityRepository.save(new City("Edinburgh", 464000));
	        cityRepository.save(new City("Suzhou", 4327066));
	        cityRepository.save(new City("Zhengzhou", 4122087));
	        cityRepository.save(new City("Berlin", 3671000));
		
	}
	
}
