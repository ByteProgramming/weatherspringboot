package com.byteprogramming.weather.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.byteprogramming.weather.dto.Temperature;

import lombok.Data;

@Entity
@Table
@Data
public class Weather implements Serializable {
	
	@Id
    @GeneratedValue
    private Integer id;
	
	@Column(nullable = false)
	private Timestamp date;
	
	@Column(nullable = false)
	private Integer pincode;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "iconId")
	private WeatherIcon weatherIcon;
	
	private boolean hasPrecipitation;
	
	private String precipitationType;
	
	@Column(nullable = false)
	private boolean IsDayTime;
	
	@Column(nullable = false)
	private double temperature;

}
