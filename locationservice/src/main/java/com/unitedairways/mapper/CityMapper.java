package com.unitedairways.mapper;

import com.unitedairways.model.City;
import com.unitedairways.payload.CityRequest;
import com.unitedairways.payload.CityResponse;

public class CityMapper {

    ///Convert Entity to Response DTO 
    public static CityResponse toCityResponse(City city){
        return new CityResponse(
            city.getId(),
            city.getName(),
            city.getCityCode(),
            city.getCountryName(),
            city.getCountryCode(),
            city.getRegionCode(),
            city.getTimeZoneId()
        );

    }

    //Convert Request DTO to Entity
    public static City toCityEntity(CityRequest cityRequest){
        City city = new City();
      //  city.setId(cityRequest.getId());
        city.setName(cityRequest.getName());
        city.setCityCode(cityRequest.getCityCode());
        city.setCountryName(cityRequest.getCountryName());
        city.setCountryCode(cityRequest.getCountryCode());
        city.setRegionCode(cityRequest.getRegionCode());
        city.setTimeZoneId(cityRequest.getTimeZoneId());
        return city;
    }

    // Update existing city from request DTO
    public static void updateCityFromRequest(City city, CityRequest cityRequest) {
        city.setName(cityRequest.getName());
        city.setCityCode(cityRequest.getCityCode());
        city.setCountryName(cityRequest.getCountryName());
        city.setCountryCode(cityRequest.getCountryCode());
        city.setRegionCode(cityRequest.getRegionCode());
        city.setTimeZoneId(cityRequest.getTimeZoneId());
    }

     
}
