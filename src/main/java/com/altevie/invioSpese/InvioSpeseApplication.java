package com.altevie.invioSpese;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InvioSpeseApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(InvioSpeseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(InvioSpeseApplication.class, args);
	}
	
    @Bean
    public CommandLineRunner commandLineRunner(StepManager stepper) {
        return args -> {
    		logger.info("Start procedure."); 
    		stepper.performs();
    		logger.info("End procedure."); 

        };
    }

}
