package com.patterns.java8.newdatetimeapi;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.util.Calendar;
import java.util.Date;

public class DateAndTimeAPI {
	public static void main(String [] args){
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		LocalDateTime currentDateAndTime = LocalDateTime.now();
		
		System.out.println(currentDate);
		System.out.println(currentTime);
		System.out.println(currentDateAndTime);
		
		//specificDate
		System.out.println(LocalDate.of(1994, Month.MARCH, 28));
		//specificTime
		System.out.println(LocalTime.of(7, 59, 32));
		//specificDateTime
		System.out.println(LocalDateTime.of(LocalDate.of(1994, Month.MARCH, 28), LocalTime.of(7, 59, 32)));
		
		//ENUMS
		LocalDate today = LocalDate.now();
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
		LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
		LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
		System.out.println("nextWeek: "+nextWeek+" nextMonth: "+nextMonth+" nextYear: "+nextYear+" nextDecade: "+nextDecade);
		System.out.println(today.getMonth());
		
		//PeriodAndDuration
		Period period = Period.between(LocalDate.of(1994, Month.MARCH, 28), LocalDate.now());
		System.out.println(period.getYears());
		Duration duration = Duration.between(LocalTime.of(8, 11, 37), LocalTime.now());
		System.out.println(duration.toHours());
		
		//Temporal Adjusters
		System.out.println(currentDate.with(nextMonth));
		
		//TimeZOne
		ZoneId myTimeZone = ZoneId.systemDefault();
		
		System.out.println(myTimeZone);
		System.out.println(ZoneId.getAvailableZoneIds());
		Instant now = new Date().toInstant();
		LocalDateTime currentDateTimeInParis = LocalDateTime.ofInstant(now, ZoneId.of("Europe/Paris"));
		System.out.println(currentDateTimeInParis);
		
		
	
		
	}
}
//credits: https://leanpub.com/whatsnewinjava8/read#leanpub-auto-new-date-and-time-api