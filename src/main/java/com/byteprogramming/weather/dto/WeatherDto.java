package com.byteprogramming.weather.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.byteprogramming.weather.model.WeatherIcon;

import lombok.Data;

@Data
public class WeatherDto {

	private Timestamp date;
	private Integer pincode;
	private Integer weatherIcon;
	private String weatherText;
	private boolean hasPrecipitation;	
	private String precipitationType;
	private boolean IsDayTime;
	private Temperature temperature;
}
