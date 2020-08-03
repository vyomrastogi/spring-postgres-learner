package com.vyom.spl.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vyom.spl.entities.City;
import com.vyom.spl.repositories.CityRepository;
import com.vyom.spl.services.CityServices;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CityServicesImpl implements CityServices {
	@Autowired
	CityRepository cityRepo;

	@Override
	public List<City> getAllCities() {
		log.info("Retrieving all cities");
		var cities =  (List<City>)cityRepo.findAll();
		log.info("Number of cities retrieved={}",cities.size());
		return cities;
	}

}
