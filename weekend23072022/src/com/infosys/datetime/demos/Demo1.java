package com.infosys.datetime.demos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo1 {

	public static void main(String[] args) {
        // Today's date
		LocalDate today=LocalDate.now();
	    System.out.println(today);
	    
	    // Display today's date in a format date/month/year
	    // ofPattern is a static method of DateTimeFormatter which is used to
	    // mention the format in which we want to display the date
	    // We have to finally use format method of DateTimeFormatter object
	    // to format the date and is returned as a String object
	   DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	   String formattedDateAsString=dateTimeFormatter.format(today);
	   System.out.println(formattedDateAsString);
	   
	   
	   // Suppose we have a date in String representation and we want to convert it into
	   // LocalDate object
	   // With ofPattern mention the format in which date is present in the String
	   // After that make use of static parse method of LocalDate
	   // Which accepts the parameter as String and object of DateTimeFormatter
	   String dateAsString="22-Jan-2021";
	   dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	   LocalDate date=LocalDate.parse(dateAsString, dateTimeFormatter);
	   System.out.println(date);
	   
	}

}
