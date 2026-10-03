package com.unitedairways.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.unitedairways.mapper.CityMapper;
import com.unitedairways.model.City;
import com.unitedairways.payload.CityRequest;
import com.unitedairways.payload.CityResponse;
import com.unitedairways.repository.CityRepository;



@Service

public class CityServiceImpl implements CityServiceInterface {

    private final CityRepository cityRepository ;

    public CityServiceImpl(CityRepository cityRepository){
        this.cityRepository=cityRepository;
    }

    @Override
    public CityResponse createCity(CityRequest request) {
        

             if (request == null) {
                     throw new IllegalArgumentException("City request cannot be null");
             }

             String code = request.getCityCode();
             if (!validateCityCode(code)) {
                     throw new IllegalArgumentException("City code must contain 1 to 100 non-whitespace characters");
             }
             code = code.trim();

             if (cityRepository.existsByCityCode(code)) {
                     throw new IllegalArgumentException("City with code " + code + " already exists.");
             }

    City city = CityMapper.toCityEntity(request);
    city.setCityCode(code);

       return CityMapper.toCityResponse(cityRepository.save(city));

        
       
    }

    @Override
    public CityResponse getCityById(Long id) {
                

       Optional<City> city = cityRepository.findById(id);
       return city.map(CityMapper::toCityResponse).orElse(null);
    }

    @Override
    public CityResponse updateCity(Long id, CityRequest request) {
        if (id == null) {
            throw new IllegalArgumentException("City id cannot be null");
        }
        if (request == null) {
            throw new IllegalArgumentException("City update request cannot be null");
        }

        String cityCode = request.getCityCode();
        if (!validateCityCode(cityCode)) {
            throw new IllegalArgumentException("City code must contain 1 to 100 non-whitespace characters");
        }
        if (request.getName() == null || request.getName().isBlank()) {
            throw new IllegalArgumentException("City name cannot be empty");
        }
        if (request.getCountryName() == null || request.getCountryName().isBlank()) {
            throw new IllegalArgumentException("Country name cannot be empty");
        }
        if (request.getCountryCode() == null || request.getCountryCode().isBlank()) {
            throw new IllegalArgumentException("Country code cannot be empty");
        }

        City city = cityRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("City with id " + id + " not found"));

        String normalizedCityCode = cityCode.trim();
        if (cityRepository.existsByCityCodeAndIdNot(normalizedCityCode, id)) {
            throw new IllegalArgumentException("City code already exists: " + normalizedCityCode);
        }

        CityMapper.updateCityFromRequest(city, request);
        city.setCityCode(normalizedCityCode);
        return CityMapper.toCityResponse(cityRepository.save(city));

    }

    @Override
    public void deleteCity(Long id) {
        
       if(id == null || id<=0){
         throw new IllegalArgumentException("City id cannot be null or empty");
       }
       cityRepository.deleteById(id);
    }

    @Override
    public Page<CityResponse> getAllCities(Pageable pageable) {
        
        Page<City> cities = cityRepository.findAll(pageable);
        return cities.map(CityMapper::toCityResponse);
    }

    @Override
    public Page<CityResponse> searchCities(String keyword, Pageable pageable) {
        
        if(keyword==null || keyword.isEmpty()){
            throw new IllegalArgumentException("Search keyword cannot be empty");
        }
        Page<City> cities = cityRepository.searchByKeyword(keyword, pageable);
        return cities.map(CityMapper::toCityResponse);
    }

    @Override
    public Page<CityResponse> getCitiesByCountryCode(String countryCode, Pageable pageable) {
        
        if(countryCode==null || countryCode.isEmpty()){
          throw new IllegalStateException("Country code cannot be empty");
        } 
        Page<City> cities = cityRepository.findByCountryCodeIgnoreCase(countryCode, pageable); 
        return cities.map(CityMapper::toCityResponse);
    }

    @Override
    public boolean cityExists(String cityCode) {
        
        if(cityCode==null || cityCode.isEmpty()){
            throw new IllegalArgumentException("City code cannot be empty");
        }
        return cityRepository.existsByCityCode(cityCode);
    }

    @Override
    public boolean validateCityCode(String cityCode) {
        return cityCode != null
                && !cityCode.isBlank()
                && cityCode.trim().length() <= 100;
    }

}
