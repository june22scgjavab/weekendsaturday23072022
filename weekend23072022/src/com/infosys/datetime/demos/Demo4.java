package com.infosys.datetime.demos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Demo4 {

	public static void main(String[] args) {
		  LocalDate date = LocalDate.now();
	      LocalDate date1 = date.plus(10, ChronoUnit.DAYS);
	      System.out.println(date1);  
	      LocalDate date2=date.plusDays(10);
          System.out.println(date2);
          LocalDate date3=date.plusDays(-10);// plusDays with minus will do minus with the date
          System.out.println(date3);
          System.out.println(date1.isAfter(date3));
          System.out.println(date1.isBefore(date3));
          System.out.println(date1.equals(date2));
          System.out.println( date.getDayOfWeek());
         
	}

}
