package com.infosys.datetime.demos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class Demo5 {

	public static void main(String[] args) {
		 LocalDate date = LocalDate.of(2014, Month.FEBRUARY, 25); // 2014-02-25
  //OR
		// LocalDate date = LocalDate.of(2014, 02 , 25);  
		    // next Sunday (2014-03-02)
		    LocalDate nextSunday = date.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		    
		    System.out.println(nextSunday);
	}

}
