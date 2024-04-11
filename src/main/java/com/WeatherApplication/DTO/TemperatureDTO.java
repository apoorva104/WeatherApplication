package com.WeatherApplication.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TemperatureDTO {
    private Integer min;
    private Integer max;
    private Integer avg;
}
