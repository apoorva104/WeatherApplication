package com.WeatherApplication.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TempDTO {
    private String unit;
    private Double avg;
    private Double min;
    private Double max;
}
