package com.unitedairways.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CityResponse {
	
	private long id;
	private String name;
	private String cityCode;
	private String countryName;
	private String countryCode;
	private String regionCode;
	private String timezoneOffset;

}
