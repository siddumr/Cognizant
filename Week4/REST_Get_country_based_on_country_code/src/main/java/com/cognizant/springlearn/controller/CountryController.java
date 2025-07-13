package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @Autowired
    private CountryService nationService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable("code") String code) {
        return nationService.getCountry(code);
    }
}
