package com.example.springsampleservice.controller;

import com.example.springsampleservice.domain.Country;
import com.example.springsampleservice.service.CountryService;
import com.example.springsampleservice.service.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @RequestMapping("/countries")
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }
    @RequestMapping("/countries/{id}")
    public Country getCountyById(@PathVariable Integer id){
        return countryService.getCountryById(id);
    }

}
