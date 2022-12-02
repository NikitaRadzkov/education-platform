package com.javafundamentals.phonebook;

import com.javafundamentals.phonebook.common.service.StartService;
import com.javafundamentals.phonebook.common.util.LoggerUtil;

import static com.javafundamentals.phonebook.common.util.LoggerUtil.LOGGER;
import static java.util.logging.Level.INFO;

public class PhonebookApplication {

	public static void main(String[] args) {
		var loggerUtil = new LoggerUtil();
		loggerUtil.initLogger();
		var startService = new StartService();
		LOGGER.log(INFO, "Start phonebook app.");
		startService.start();
	}

}
