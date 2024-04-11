package com.WeatherApplication.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AstronomyDTO {
    private String dawn;
    private String sunrise;
    private String suntransit;
    private String sunset;
    private String dusk;
    private String moonrise;
    private String moontransit;
    private String moonset;
    private int moonphase;
    private int moonzodiac;
}
