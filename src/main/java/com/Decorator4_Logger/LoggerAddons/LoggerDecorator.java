package com.Decorator4_Logger.LoggerAddons;

import com.Decorator4_Logger.Interface.ILogger;

public abstract class LoggerDecorator implements ILogger {
    private ILogger logger;

    public LoggerDecorator(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public String log(String message) {
        return this.logger.log(message);
    }

    @Override
    public String log(String message, LoggerTypes type) {
        return this.logger.log(message, type);
    }
}
