package com.unitedairways.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;



public class CityRequest {
	public CityRequest() {
	}
	
	public CityRequest(@NotBlank(message = "City Name is required") @Size(max = 100) String name,
			@NotBlank(message = "City Code is required") @Size(max = 100) String cityCode,
			@NotBlank(message = "Country Name is required") @Size(max = 100) String countryName,
			@NotBlank(message = "Country Code is required") @Size(max = 100) String countryCode,
			@Size(max = 10) String regionCode, @Size(max = 50) String timeZoneId) {
		this.name = name;
		this.cityCode = cityCode;
		this.countryName = countryName;
		this.countryCode = countryCode;
		this.regionCode = regionCode;
		this.timeZoneId = timeZoneId;
	}
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
	@Size(max=50)
	private String timeZoneId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getTimeZoneId() {
		return timeZoneId;
	}
	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}
	@Override
	public String toString() {
		return "CityRequest [name=" + name + ", cityCode=" + cityCode + ", countryName=" + countryName
				+ ", countryCode=" + countryCode + ", regionCode=" + regionCode + ", timeZoneId=" + timeZoneId + "]";
	}

}

