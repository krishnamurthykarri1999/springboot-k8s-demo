package com.getJob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamApiApplication {

	
	private static final Logger log=LoggerFactory.getLogger(StreamApiApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(StreamApiApplication.class, args);
		
		log.info("your app started stream apis");
		
		
	}
	
	

}
