package com.WeatherApplication.DTO;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DayWiseDTO {
    private String date;
    private int maxTemp;
    private  int minTemp;
    private  String windDirection;
    private int maxWindSpeed;
    private int minWindSpeed;
    private int maxWindChill;
    private int minWindChill;
    private String dawn;
    private String dusk;
    private String sunset;
    private String sunrise;

    private String moonRise;


}
