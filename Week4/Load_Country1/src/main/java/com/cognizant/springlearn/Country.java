package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    private String isoCode;
    private String countryName;

    public Country() {
        LOGGER.debug("Inside Country Constructor.");
    }

    public String getIsoCode() {
        LOGGER.debug("Getting ISO Code.");
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        LOGGER.debug("Setting ISO Code to: {}", isoCode);
        this.isoCode = isoCode;
    }

    public String getCountryName() {
        LOGGER.debug("Getting Country Name.");
        return countryName;
    }

    public void setCountryName(String countryName) {
        LOGGER.debug("Setting Country Name to: {}", countryName);
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country [isoCode=" + isoCode + ", countryName=" + countryName + "]";
    }
}