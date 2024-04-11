package com.WeatherApplication.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ForecastItemDTO {
    private String date;
    private String dateWithTimezone;
    private int freshSnow;
    private Integer snowHeight;
    private WeatherDetailsDTO weather;
    private PrecDTO prec;
    private int sunHours;
    private Integer rainHours;
    private TemperatureDTO temperature;
    private WindDTO wind;
    private WindchillDTO windchill;
    private SnowLineDTO snowLine;
    private AstronomyDTO astronomy;
}
