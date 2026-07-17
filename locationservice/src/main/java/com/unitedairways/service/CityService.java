package com.unitedairways.service;

import org.springframework.boot.data.autoconfigure.web.DataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.unitedairways.payload.CityRequest;
import com.unitedairways.payload.CityResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CityService implements ICityService {

    @Override
    public CityResponse createCity(CityRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCity'");
    }

    @Override
    public CityResponse getCityById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCityById'");
    }

    @Override
    public CityResponse updateCity(Long id, CityRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCity'");
    }

    @Override
    public void deleteCity(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCity'");
    }

    @Override
    public Page<CityResponse> getAllCities(Pageable pageable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCities'");
    }

    @Override
    public Page<CityResponse> searchCities(String keyword, Pageable pageable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchCities'");
    }

    @Override
    public Page<CityResponse> getCitiesByCountryCode(String countryCode, Pageable pageable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCitiesByCountryCode'");
    }

    @Override
    public boolean cityExists(String cityCode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cityExists'");
    }

    @Override
    public boolean validateCityCode(String cityCode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateCityCode'");
    }

}
