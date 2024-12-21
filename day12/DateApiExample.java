package com.day12;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateApiExample {
    // to over come date in utility class developer developed seperate api for date
	//no need for utility classes
	
	public static void main(String[] args) {
		
		//now() is static method
		 LocalDate date = LocalDate.now();
		 System.out.println(date);
		 System.out.println(date.getYear());
		 System.out.println(date.getMonthValue());
		 
		 
		 LocalTime time = LocalTime.now();
		 System.out.println(time);
		 
		 LocalDateTime datetime = LocalDateTime.now();
		 System.out.println(datetime);
		 

	}

}
