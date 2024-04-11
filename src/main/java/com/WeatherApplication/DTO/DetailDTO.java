package com.WeatherApplication.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class DetailDTO {
    private String date;
    private TempDTO temperature;
    private WindDTO2 wind;
    private int pressure;
}
