package com.byteprogramming.weather.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.byteprogramming.weather.dto.WeatherDto;
import com.byteprogramming.weather.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	private WeatherService weatherService;
	
	@Autowired
	public WeatherController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}
	
	@GetMapping("/pincode")
	public ResponseEntity<WeatherDto> getWeatherInfo(@RequestParam("pincode") Integer pincode){
		WeatherDto weatherInfo = weatherService.generateWeatherInfo(pincode);
		if(weatherInfo != null) {
		return new ResponseEntity<WeatherDto>(weatherInfo, HttpStatus.OK);
		}
		
		return new ResponseEntity<WeatherDto>(weatherInfo,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
