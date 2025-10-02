package com.getJob.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionHandling {

	@GetMapping("/access")
	public String  get() {
		return "access krishnamurthy";
	}

}
