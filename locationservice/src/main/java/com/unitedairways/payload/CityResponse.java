package com.unitedairways.payload;



public class CityResponse {
	
	
	public CityResponse(long id, String name, String cityCode, String countryName, String countryCode,
			String regionCode, String timezoneOffset) {
		this.id = id;
		this.name = name;
		this.cityCode = cityCode;
		this.countryName = countryName;
		this.countryCode = countryCode;
		this.regionCode = regionCode;
		this.timezoneOffset = timezoneOffset;
	}
	private long id;
	private String name;
	private String cityCode;
	private String countryName;
	private String countryCode;
	private String regionCode;
	private String timezoneOffset;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public String getTimezoneOffset() {
		return timezoneOffset;
	}
	public void setTimezoneOffset(String timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}
	@Override
	public String toString() {
		return "CityResponse [id=" + id + ", name=" + name + ", cityCode=" + cityCode + ", countryName=" + countryName
				+ ", countryCode=" + countryCode + ", regionCode=" + regionCode + ", timezoneOffset=" + timezoneOffset
				+ "]";
	}

}
