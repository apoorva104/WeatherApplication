package com.WeatherApplication.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WindDTO2 {
    private String unit;
    private String direction;
    private String text;
    private Double avg;
    private Double min;
    private Double max;
    private GustDTO2 gusts;
    private boolean significationWind;
}
