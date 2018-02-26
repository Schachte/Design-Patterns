package com.Decorator4_Logger.LoggerAddons;

import com.Decorator4_Logger.Interface.ILogger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeLogger extends LoggerDecorator{
    public TimeLogger(ILogger logger) {
        super(logger);
    }

    @Override
    public String log(String message) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime localTime = LocalDateTime.now();
        return super.log(dtf.format(localTime) + " " + message);
    }

    @Override
    public String log(String message, LoggerTypes type) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime localTime = LocalDateTime.now();
        return super.log(dtf.format(localTime) + " " + message, type);
    }
}
