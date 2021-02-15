package com.example.handlingerros.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.handlingerros.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
