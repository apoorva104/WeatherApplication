package com.WeatherApplication.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WindDTO {
    private String unit;
    private String direction;
    private String text;
    private Integer avg;
    private Integer min;
    private Integer max;
    private GustsDTO gusts;
    private boolean significationWind;
}
