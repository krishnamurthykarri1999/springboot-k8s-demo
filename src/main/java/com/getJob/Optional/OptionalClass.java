package com.getJob.Optional;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {

		Optional<String> opt = Optional.ofNullable(null);

		opt.ifPresent(System.out::println); //

		opt.ifPresentOrElse((s) -> {
			System.out.println("Value is present" + s);
		}, () -> {
			System.out.println("Value is not present");
		});
		
		
		
		

	}
}
