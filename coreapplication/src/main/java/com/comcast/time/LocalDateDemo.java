package com.comcast.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LocalDateDemo {

	public static void main(String[] args) {
		 
			LocalDate today = LocalDate.now();
			String todayStr = today.format(DateTimeFormatter.ISO_DATE);
			System.out.println("String Formate: "+todayStr);
			System.out.println(today);
			
			LocalDate yesterday = today.minusDays(1); 
			System.out.println(yesterday); 
			
			LocalDate dayAfterTomorrow = today.plusDays(2); 
			System.out.println(dayAfterTomorrow);
			
			LocalDate dob = LocalDate.of(1991, 05, 23);
			System.out.println(dob); 
			System.out.println(dob.isLeapYear());
			
			LocalDateTime myDoB = dob.atTime(9, 12, 40); 
			System.out.println(myDoB);
			
			LocalDate cdate1 = LocalDate.of(2012, 01, 01); 
			System.out.println(cdate1.isLeapYear());
			String doj = "2019-03-25"; // convert String to LocalDate 
			
			LocalDate myDoJ = LocalDate.parse(doj); 
			System.out.println(myDoJ);

	}

}
