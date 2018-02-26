package com.Decorator4_Logger.LoggerAddons;

import com.Decorator4_Logger.Interface.ILogger;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateLogger extends LoggerDecorator{
    public DateLogger(ILogger logger) {
        super(logger);
    }

    @Override
    public String log(String message) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        return super.log(dtf.format(localDate) + " " + message);
    }

    @Override
    public String log(String message, LoggerTypes type) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        return super.log(dtf.format(localDate) + " " + message, type);
    }
}
