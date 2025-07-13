package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private ApplicationContext applicationContext;

    public Country getCountry(String countryIdentifier) {
        List<Country> nations = (List<Country>) applicationContext.getBean("countryList");
        return nations.stream()
                .filter(nation -> nation.getAlphaCode().equalsIgnoreCase(countryIdentifier))
                .findFirst()
                .orElse(null);
    }
}
