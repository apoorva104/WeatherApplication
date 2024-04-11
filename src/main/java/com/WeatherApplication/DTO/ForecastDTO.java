package com.WeatherApplication.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class ForecastDTO {



        private List<ForecastItemDTO> items;
        private String forecastDate;
        private String nextUpdate;
        private String source;
        private String point;
        private String fingerprint;
    }

