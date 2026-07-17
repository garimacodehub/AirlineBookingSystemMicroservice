package com.unitedairways.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CityRequest {
	
	@NotBlank(message="City Name is required")
	@Size(max=100)
	private String name;
	@NotBlank(message="City Code is required")
	@Size(max=100)
	private String cityCode;
	@NotBlank(message="Country Name is required")
	@Size(max=100)
	private String countryName;
	@NotBlank(message="Country Code is required")
	@Size(max=100)
	private String countryCode;
	@Size(max=10)
	private String regionCode;
	@Size(max=10)
	private String timeZoneId;

}
