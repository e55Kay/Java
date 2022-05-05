package com.comcast.time;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalTime ctime = LocalTime.of(12, 15, 48);
		System.out.println(ctime);
		
		LocalTime ctime1 = ctime.minusHours(2);
		System.out.println(ctime1);
		
		LocalTime ctime2 = ctime.minusMinutes(16);
		System.out.println(ctime2);
		
		LocalTime ctime3 = ctime.plusHours(3);
		System.out.println(ctime3);
		
		LocalTime ctime4 = ctime.plusMinutes(24);
		System.out.println(ctime4);
		
		ZoneId zone1 = ZoneId.of("UTC+05:30");
		ZoneId zone2 = ZoneId.of("Europe/London");
		ZoneId zone3 = ZoneId.of("Asia/Tokyo");
		
		LocalTime india = LocalTime.now(zone1);
		LocalTime london = LocalTime.now(zone2);
		LocalTime japan = LocalTime.now(zone3);
		
		System.out.println("India Time: " + india);
		System.out.println("London Time: " + london);
		System.out.println("Japan Time: " + japan);
		
	}

}
