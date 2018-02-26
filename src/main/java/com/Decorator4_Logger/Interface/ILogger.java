package com.Decorator4_Logger.Interface;

import com.Decorator4_Logger.LoggerAddons.LoggerTypes;

public interface ILogger {
    public String log(String message);
    public String log(String message, LoggerTypes type);
}
