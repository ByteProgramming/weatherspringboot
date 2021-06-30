package com.byteprogramming.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class ByteprogrammingWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(ByteprogrammingWeatherApplication.class, args);
	}

}
