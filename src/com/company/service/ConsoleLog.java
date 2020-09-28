package com.company.service;

public class ConsoleLog implements Log{
    @Override
    public void logMessage(String message) {
        System.out.println(message);
    }
}
