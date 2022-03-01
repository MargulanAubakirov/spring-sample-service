package com.example.springsampleservice.service;

import com.example.springsampleservice.domain.Country;
import com.example.springsampleservice.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryRepository countryRepository;
    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Country getCountryById(Integer id) {
        return countryRepository.findById(id).get();
    }

    @Override
    public Country getCountryByName(String name) {
        return countryRepository.findByName(name);
    }
}
