package com.byteprogramming.weather.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.byteprogramming.weather.dto.Temperature;
import com.byteprogramming.weather.model.Weather;

@Repository
public interface WeatherRepository extends CrudRepository<Weather, Integer> {
	
	Weather findByPincode(Integer pincode);

}
