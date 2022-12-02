package com.javafundamentals.store.common.util;

import com.javafundamentals.store.StoreApplication;
import com.javafundamentals.store.exception.LoggerException;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerUtil {

    public static Logger LOGGER;

    public void initLogger() throws LoggerException {
        try(FileInputStream ins = new FileInputStream("src/main/resources/logger.config")){
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = java.util.logging.Logger.getLogger(StoreApplication.class.getName());
        } catch (Exception e) {
            throw new LoggerException();
        }
    }

}
