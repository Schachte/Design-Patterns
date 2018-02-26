package com.Decorator4_Logger.LoggerAddons;

import com.Decorator4_Logger.Interface.ILogger;

public class TypeLogger extends LoggerDecorator{
    public TypeLogger(ILogger logger) {
        super(logger);
    }

    @Override
    public String log(String message) {
        return super.log(message);
    }

    @Override
    public String log(String message, LoggerTypes type) {
        return super.log(message, type);
    }
}
