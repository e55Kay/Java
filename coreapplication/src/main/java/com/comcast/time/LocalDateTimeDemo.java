package com.comcast.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		today = today.plusHours(5);
		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss a");
		String formatDateTime = today.format(pattern);
		System.out.println(formatDateTime);

	}

}
