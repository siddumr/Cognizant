package com.library;

import com.library.logic.LibraryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext catalog = new ClassPathXmlApplicationContext("applicationContext.xml");
        LibraryService system = (LibraryService) catalog.getBean("libraryServiceBean");
        system.initiateRetrieval();
    }
}