package com.getJob.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionHandling {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandling.class);

    @GetMapping("/test")
    public String test() {
        logger.info("Info lsog: /test API called");
        logger.error("Error log example");
        return "Logging test successful!";
    }
}

