package com.byteprogramming.weather.model;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.byteprogramming.weather.dto.Temperature;

import lombok.Data;

@Entity
@Table
@Data
public class WeatherIcon implements Serializable {
	
	@Id
    @GeneratedValue
    @Column(nullable = false)
	private Integer iconId;
		
	@Column(nullable = false)
	private String weatherText;
	
	

}
