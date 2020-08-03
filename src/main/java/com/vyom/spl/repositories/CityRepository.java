package com.vyom.spl.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vyom.spl.entities.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
