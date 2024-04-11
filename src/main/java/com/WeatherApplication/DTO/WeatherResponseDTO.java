package com.WeatherApplication.DTO;

import lombok.*;

import java.util.List;
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WeatherResponseDTO {
     private String Name;
    private  Double longitude;
    private Double latitude;
    List<DayWiseDTO> items;

}
