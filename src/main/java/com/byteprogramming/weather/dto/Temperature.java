package com.byteprogramming.weather.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Temperature {
	
	private Unit metric;
	private Unit imperial;
}
