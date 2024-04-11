package com.WeatherApplication.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HistoryDTO {
    private String datetime;
    private  double avgTemp;
    private  double avgWindSpeed;
    private int pressure;
}
