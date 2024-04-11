package com.WeatherApplication.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class LocationDTO {
    private String code;
    private String name;
    private String timezone;
    private CoordinatesDTO coordinates;
}
