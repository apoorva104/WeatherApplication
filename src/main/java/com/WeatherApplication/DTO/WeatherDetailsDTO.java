package com.WeatherApplication.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WeatherDetailsDTO {
    private int state;
    private String text;
    private String icon;
}
