package Lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {

	

	public static void LocalDateTimeApi() {
		LocalDate date = LocalDate.now();
		System.out.println("the current date is " + date);
		
		LocalTime time = LocalTime.now();
		System.out.println("the current time is " + time);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println(" current date and time :" + current);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:SS");
		
		String formatedDateTime = current.format(format);
		
	
		System.out.println("in formatted manner " + 
		formatedDateTime);
		
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		int hour = current.getHour();
		int year = current.getYear();
		System.out.println("Month :"+month+" day :" + day+" seconds :"
				+seconds+" hour :"+hour+"year :" + year);
		
		LocalDate date2 = LocalDate.of(1973, 1, 26);
		System.out.println("birthday:" +date2);
		
		LocalDateTime specificDate = current.withDayOfMonth(12).withYear(2018);
		System.out.println("specific date with "+"current time :"+specificDate);
	}
		public static void main(String[] args)
		{
			LocalDateTimeApi();
		}
	}
	

