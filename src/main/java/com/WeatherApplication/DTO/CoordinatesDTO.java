package com.WeatherApplication.DTO;

import lombok.*;

@Data
@NoArgsConstructor
public class CoordinatesDTO {
    private double latitude;
    private double longitude;
    private Double elevation;

}
