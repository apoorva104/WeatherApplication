package com.WeatherApplication.DTO;

import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Data
@Getter @Setter
@NoArgsConstructor
public class WeatherDTO {
    private LocationDTO location;
    private ForecastDTO forecast;
}


