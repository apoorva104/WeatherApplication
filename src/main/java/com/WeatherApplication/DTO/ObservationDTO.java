package com.WeatherApplication.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ObservationDTO {

    private String id;
    private String name;
    private String type;
    private int distance;
    private CoordinatesDTO coordinates;
    private List<HistoryEntryDTO> history;


}

