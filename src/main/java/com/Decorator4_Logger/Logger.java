package com.Decorator4_Logger;

import com.Decorator4_Logger.Impls.BasicLogger;
import com.Decorator4_Logger.Interface.ILogger;
import com.Decorator4_Logger.LoggerAddons.DateLogger;
import com.Decorator4_Logger.LoggerAddons.LoggerTypes;
import com.Decorator4_Logger.LoggerAddons.TimeLogger;

import static com.Decorator4_Logger.LoggerAddons.LoggerTypes.*;

public class Logger {
    public static void main(String[] args) {
        ILogger log = new BasicLogger();
        log.log("test", DEBUG);
        log.log("test");
        log.log("This should error", ERROR);
    }
}
