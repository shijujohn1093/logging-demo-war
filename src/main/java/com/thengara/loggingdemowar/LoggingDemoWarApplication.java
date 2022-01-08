package com.thengara.loggingdemowar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingDemoWarApplication {

	private static Logger logger = LoggerFactory.getLogger(LoggingDemoWarApplication.class);

	
	
	
	public static void main(String[] args) {
		logger.info("Applicaiton starting");
		SpringApplication.run(LoggingDemoWarApplication.class, args);
	}


	
}
