package com.example.springsampleservice.controller;

import com.example.springsampleservice.domain.Country;
import com.example.springsampleservice.service.CountryService;
import com.example.springsampleservice.service.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/list")
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }
    @RequestMapping("/{id}")
    public Country getCountyById(@PathVariable Integer id){
        return countryService.getCountryById(id);
    }
    @GetMapping
    public Country getCountryById(@RequestParam String name){
        return countryService.getCountryByName(name);
    }

}
