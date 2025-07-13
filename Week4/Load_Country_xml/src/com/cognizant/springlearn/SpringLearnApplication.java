package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LOGGER.debug("Starting the Application...");
        showSelectedCountry();
        LOGGER.debug("Application Finished.");
    }

    public static void showSelectedCountry() {
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    Country chosenCountry = (Country) context.getBean("favoriteCountry");
    LOGGER.debug("Country : {}", chosenCountry.toString());
}

}