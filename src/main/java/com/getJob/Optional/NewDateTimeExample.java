package com.getJob.Optional;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class NewDateTimeExample {
	
	public static void main(String[] args) {
		
		LocalDate justDate = LocalDate.now(); // Current date (2024-05-16)
		LocalTime justTime = LocalTime.now(); // Current time (14:30:15.123)
		LocalDateTime dateAndTime = LocalDateTime.now(); // Current date and time without timezone
		ZonedDateTime zonedDateTime = ZonedDateTime.now(); // Current date/time in the system's timezone
		Instant instant = Instant.now(); // An instantaneous point on the timeline in UTC.

		System.out.println("Date: " + justDate);
		System.out.println("Time: " + justTime);
		System.out.println("Date & Time: " + dateAndTime);
		System.out.println("Zoned: " + zonedDateTime);
		System.out.println("Instant: " + instant);

		// 2. IMMUTABLE & THREAD-SAFE (All operations return a NEW object)
		LocalDate today = LocalDate.now();
		LocalDate nextWeek = today.plusWeeks(1); // Returns a new object
		LocalDate nextMonth = today.plusMonths(1); // Clean, fluent API

		// 3. HUMAN-FRIENDLY MANIPULATION (Months are 1-based!)
		LocalDate birthday = LocalDate.of(1990, Month.DECEMBER, 31); // December is 12!
		DayOfWeek dayOfWeek = birthday.getDayOfWeek();
		System.out.println("I was born on a: " + dayOfWeek); // MONDAY

		// 4. TIMEZONE HANDLING MADE EASY
		ZoneId londonZone = ZoneId.of("Europe/London");
		ZonedDateTime londonTime = ZonedDateTime.now(londonZone);
		System.out.println("Time in London: " + londonTime);

		// 5. FORMATTING AND PARSING (Thread-safe formatters!)
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = today.format(formatter);
		System.out.println("Formatted: " + formattedDate);

		LocalDate parsedDate = LocalDate.parse("16/05/2024", formatter);
		System.out.println("Parsed: " + parsedDate); // Just the date, no time!
	}
}
