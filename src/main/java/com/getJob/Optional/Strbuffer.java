package com.getJob.Optional;

public class Strbuffer {

	public static void main(String[] args) {

		String name = "krishnamurthy";

		String extracted = name.substring(0, 7);

		System.out.println("my short name is : " + extracted);

		System.out.println("my last name is  : " + name.substring(7));

		int index = name.indexOf("m");

		System.out.println("index positon of m is : " + index);

		String email = "krishnamurthykarri1999@gmail.com";

		int emailindex = email.indexOf("@") + 1;

		System.out.println(email.substring(emailindex));

		String dateTime = "2025-09-30 10:45:00";

		String date = dateTime.substring(0, 10);

		String time = dateTime.substring(11);

		System.out.println("extracted date : " + date);
		System.out.println("extracted time : " + time);

		String s1 = "hello";

		s1 = s1.concat("world");

		System.out.println("s1 is " + s1);

	}
}
