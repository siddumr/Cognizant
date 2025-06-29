package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {
    private static final Logger auditLogger = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {
        auditLogger.error("Critical issue encountered during system operation.");
        auditLogger.warn("This is just a cautionary warning.");
    }
}
