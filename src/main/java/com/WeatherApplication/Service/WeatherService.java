package com.WeatherApplication.Service;
import com.WeatherApplication.DTO.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {
    @Autowired
    private RestTemplate restTemplate;
//@Autowired
//   private WeatherResponseDTO weatherResponseDTO;
//@Autowired
// private DayWiseDTO dayWiseDTO;
    public WeatherResponseDTO weatherService(String City){

        String cityName=City;
        String url = "https://forecast9.p.rapidapi.com/rapidapi/forecast/"+cityName+"/summary/";

        HttpHeaders header=new HttpHeaders();
        header.set("X-RapidAPI-Key", "3aace01db7msh970678f6b1f24b7p1d89e8jsnd42cf39d5f61");
        header.set("X-RapidAPI-Host", "forecast9.p.rapidapi.com");

        HttpEntity<String> entity = new HttpEntity<>(header);

        ResponseEntity<WeatherDTO> response = restTemplate.exchange(url, HttpMethod.GET, entity, WeatherDTO.class);

        WeatherDTO weatherDTO = response.getBody();
       // System.out.print(weatherDTO);

        WeatherResponseDTO weatherResponseDTO= new WeatherResponseDTO();

        weatherResponseDTO.setName(weatherDTO.getLocation().getName());
        weatherResponseDTO.setLatitude(weatherDTO.getLocation().getCoordinates().getLatitude());
        weatherResponseDTO.setLongitude(weatherDTO.getLocation().getCoordinates().getLongitude());

        List<DayWiseDTO> drawData= new ArrayList<>();
        for(int i=0;i<7;i++){
        	DayWiseDTO dayWiseDTO=new DayWiseDTO();
            dayWiseDTO.setDate(weatherDTO.getForecast().getItems().get(i).getDate());
            dayWiseDTO.setMaxTemp(weatherDTO.getForecast().getItems().get(i).getTemperature().getMax());
            dayWiseDTO.setMinTemp(weatherDTO.getForecast().getItems().get(i).getTemperature().getMin());
            dayWiseDTO.setWindDirection(weatherDTO.getForecast().getItems().get(i).getWind().getDirection());
            dayWiseDTO.setMaxWindSpeed(weatherDTO.getForecast().getItems().get(i).getWind().getMax());
            dayWiseDTO.setMinWindSpeed(weatherDTO.getForecast().getItems().get(i).getWind().getMin());
            dayWiseDTO.setMaxWindSpeed(weatherDTO.getForecast().getItems().get(i).getWindchill().getMax());
            dayWiseDTO.setMinWindChill(weatherDTO.getForecast().getItems().get(i).getWindchill().getMin());
            dayWiseDTO.setDawn(weatherDTO.getForecast().getItems().get(i).getAstronomy().getDawn());
            dayWiseDTO.setDusk(weatherDTO.getForecast().getItems().get(i).getAstronomy().getDusk());
            dayWiseDTO.setSunrise(weatherDTO.getForecast().getItems().get(i).getAstronomy().getSunrise());
            dayWiseDTO.setSunset(weatherDTO.getForecast().getItems().get(i).getAstronomy().getSunset());
            dayWiseDTO.setMoonRise(weatherDTO.getForecast().getItems().get(i).getAstronomy().getMoonrise());

            drawData.add(dayWiseDTO);
        }
        weatherResponseDTO.setItems(drawData);
        return weatherResponseDTO;
    }

public ObservationResponseDTO observationService(float longitude,float latitude){
    float longi=longitude;
    float lati=latitude;
    String url="https://forecast9.p.rapidapi.com/rapidapi/station/nearBy/"+longi+"/"+lati+"/";
    HttpHeaders header=new HttpHeaders();
    header.set("X-RapidAPI-Key", "3aace01db7msh970678f6b1f24b7p1d89e8jsnd42cf39d5f61");
    header.set("X-RapidAPI-Host", "forecast9.p.rapidapi.com");

    HttpEntity<String> entity = new HttpEntity<>(header);

    ResponseEntity<ObservationDTO> response = restTemplate.exchange(url, HttpMethod.GET, entity, ObservationDTO.class);
    ObservationDTO observationDTO=response.getBody();
    ObservationResponseDTO observationResponseDTO=new ObservationResponseDTO();
    observationResponseDTO.setDistance(observationDTO.getDistance());
    List<HistoryDTO> list=new ArrayList<>();
    for(int i=0;i<7;i++){
       HistoryDTO historyDTO=new HistoryDTO();
       historyDTO.setDatetime(observationDTO.getHistory().get(0).getDetails().get(i).getDate());
       historyDTO.setPressure(observationDTO.getHistory().get(0).getDetails().get(i).getPressure());
       historyDTO.setAvgTemp(observationDTO.getHistory().get(0).getDetails().get(i).getTemperature().getAvg());
       historyDTO.setAvgWindSpeed(observationDTO.getHistory().get(0).getDetails().get(i).getWind().getAvg());
       list.add(historyDTO);
    }
    observationResponseDTO.setHistory(list);
    return observationResponseDTO;

}
}
