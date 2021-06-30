package com.byteprogramming.weather.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsUtil implements WebMvcConfigurer {

	/**
     * addCorsMappings : WebConfig.
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer
     *
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE").allowedOrigins("*");
    }
}
