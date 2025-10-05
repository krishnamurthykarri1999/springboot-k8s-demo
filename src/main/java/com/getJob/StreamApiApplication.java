
package com.getJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StreamApiApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(StreamApiApplication.class);
    }

   private static final Logger log=LoggerFactory.getLogger(StreamApiApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(StreamApiApplication.class, args);
		
		log.info("your app started stream apis");
		
		
	}
}

