package com.unitedairways.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;


@Entity

public class City {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	@Column(nullable=false)
	private String name;
    @Column(nullable=false, unique=true)
	private String cityCode;
	@Column(nullable=false, unique=true)
	private String countryCode;
	@Column(nullable=false)
	private String countryName;
	@Size(max=10)
	private String regionCode;
	@Column(name="time_zone_id",length=50)
	private String timeZoneId;
	
	public City(Long id, String name, String cityCode, String countryCode, String countryName,
			@Size(max = 10) String regionCode, String timeZoneId) {
		this.id = id;
		this.name = name;
		this.cityCode = cityCode;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.regionCode = regionCode;
		this.timeZoneId = timeZoneId;
	}
	public City() {
		
	}
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
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
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
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
		return "City [id=" + id + ", name=" + name + ", cityCode=" + cityCode + ", countryCode=" + countryCode
				+ ", countryName=" + countryName + ", regionCode=" + regionCode + ", timeZoneId=" + timeZoneId + "]";
	}
	
}
