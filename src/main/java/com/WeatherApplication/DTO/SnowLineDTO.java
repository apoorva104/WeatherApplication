package com.WeatherApplication.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SnowLineDTO {
    private Integer avg;
    private Integer min;
    private Integer max;
    private String unit;
}
