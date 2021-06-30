package com.byteprogramming.weather.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.byteprogramming.weather.dto.Temperature;
import com.byteprogramming.weather.dto.Unit;
import com.byteprogramming.weather.dto.WeatherDto;
import com.byteprogramming.weather.model.Weather;
import com.byteprogramming.weather.model.WeatherIcon;
import com.byteprogramming.weather.repository.WeatherRepository;

@Service
public class WeatherService {

	private final WeatherRepository weatherRepo;
	
	public WeatherService(final WeatherRepository weatherRepo) {
		this.weatherRepo = weatherRepo;
	}
	
	public WeatherDto generateWeatherInfo(Integer pincode) {
		 Weather weatherData = weatherRepo.findByPincode(pincode);
		 if(weatherData != null) {
		 WeatherDto dto =  new WeatherDto();
		 dto.setDate(weatherData.getDate());
		 dto.setHasPrecipitation(weatherData.isHasPrecipitation());
	   	 dto.setIsDayTime(weatherData.isIsDayTime());
		 dto.setPincode(weatherData.getPincode());
		 dto.setPrecipitationType(weatherData.getPrecipitationType());
		 dto.setTemperature(buildTemperature(weatherData.getTemperature()));
		 dto.setWeatherIcon(weatherData.getWeatherIcon().getIconId());
		 dto.setWeatherText(weatherData.getWeatherIcon().getWeatherText());
		 
		 return dto;
		 
		 }
		return null;
	}
	
	private Unit buildCelUnit(double temperature) {
		 
	    Unit unit = new Unit();
	    unit.setUnit(17);
	    unit.setUnitType("Clesius");
	    unit.setValue(temperature);
		return unit;
		
	}
	
	private Unit buildFarenheightUnit(double temperature) {
		 
		Unit unit = new Unit();
		unit.setUnit(18);
		unit.setUnitType("Farenheight");
		unit.setValue(temperature);
		return unit;
		
	}
	
	private Temperature buildTemperature(double temperature) {
		Temperature temp = new Temperature();
		temp.setImperial(buildFarenheightUnit(temperature));
		temp.setMetric(buildCelUnit(temperature));
		return temp;
	}
	
}
