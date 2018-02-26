package com.Decorator4_Logger.Impls;

import com.Decorator4_Logger.Interface.ILogger;
import com.Decorator4_Logger.LoggerAddons.LoggerTypes;

public class BasicLogger implements ILogger{

    @Override
    public String log(String message) {
        System.out.println(message);
        return message;
    }

    @Override
    public String log(String message, LoggerTypes type) {
        System.out.println("[" + type.toString() + "]: " + message);
        return message;
    }
}
