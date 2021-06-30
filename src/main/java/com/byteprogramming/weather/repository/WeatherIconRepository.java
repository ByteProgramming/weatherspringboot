package com.byteprogramming.weather.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.byteprogramming.weather.dto.Temperature;
import com.byteprogramming.weather.model.Weather;
import com.byteprogramming.weather.model.WeatherIcon;

@Repository
public interface WeatherIconRepository extends CrudRepository<WeatherIcon, Integer> {

}
