package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainExecutor {
    public static void main(String[] args) {
        ApplicationContext schematic = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService registrar = (BookService) schematic.getBean("archiveAdmin");
        registrar.retrieveBook();
    }
}