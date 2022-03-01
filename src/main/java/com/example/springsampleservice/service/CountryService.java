package com.example.springsampleservice.service;

import com.example.springsampleservice.domain.Country;

import java.util.List;

public interface CountryService {

    List<Country> getAllCountries();

    Country getCountryById(Integer id);

    Country getCountryByName(String name);
}
