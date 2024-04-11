package com.WeatherApplication.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PrecDTO {
    private int sum;
    private int probability;
    private Integer sumAsRain;
    private int clazz;
}
