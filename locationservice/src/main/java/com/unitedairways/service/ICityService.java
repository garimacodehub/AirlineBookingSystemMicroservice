package com.unitedairways.service;


import org.springframework.boot.data.autoconfigure.web.DataWebProperties.Pageable;
import org.springframework.data.domain.Page;

import com.unitedairways.payload.CityRequest;
import com.unitedairways.payload.CityResponse;

public interface ICityService {

    CityResponse createCity(CityRequest request);
    CityResponse getCityById(Long id);
    CityResponse updateCity(Long id, CityRequest request);
    void deleteCity(Long id);
    Page<CityResponse> getAllCities(Pageable pageable);
    Page<CityResponse> searchCities(String keyword,Pageable pageable);
    Page<CityResponse> getCitiesByCountryCode(String countryCode,Pageable pageable);
    boolean cityExists(String cityCode);
    boolean validateCityCode(String cityCode);

}
