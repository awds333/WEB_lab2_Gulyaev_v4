package com.company.service;

/**
 * The type Console log.
 */
public class ConsoleLog implements Log{
    @Override
    public void logMessage(String message) {
        System.out.println(message);
    }
}
