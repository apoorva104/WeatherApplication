package com.WeatherApplication.controllers;

import com.WeatherApplication.DTO.ObservationResponseDTO;
import com.WeatherApplication.DTO.WeatherResponseDTO;
import com.WeatherApplication.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;
    
    @GetMapping("/forecastSummaryByLocation")
    public WeatherResponseDTO forecastSummaryByLocation(@RequestParam String city){
    WeatherResponseDTO weatherResponseDTO=weatherService.weatherService(city);
    return  weatherResponseDTO;

}
    
    
@GetMapping("/observationHistoryByLocation")
public ObservationResponseDTO observationHistoryByLocation(@RequestParam float longitude, @RequestParam float latitude) {
	ObservationResponseDTO observationResponseDTO=weatherService.observationService(longitude,latitude);
    return observationResponseDTO;
}

}
