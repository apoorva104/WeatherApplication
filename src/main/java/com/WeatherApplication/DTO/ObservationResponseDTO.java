package com.WeatherApplication.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class ObservationResponseDTO {
	private String DISCLAIMER="The second API given was paid, so I have integrated another API";
private int distance;
List<HistoryDTO> history;

}
