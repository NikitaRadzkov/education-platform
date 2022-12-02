package com.javafundamentals.phonebook.common.util;

import com.javafundamentals.phonebook.PhonebookApplication;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerUtil {

    public static Logger LOGGER;

    public void initLogger() {
        try(var ins = new FileInputStream("src/main/resources/logger.config")){
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(PhonebookApplication.class.getName());
        } catch (Exception e){
            System.out.println("Logger error!");
        }
    }
}
