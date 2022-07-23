package com.infosys.datetime.demos;

import java.time.LocalDate;
import java.time.Period;

public class Demo2 {

	public static void main(String[] args) {
	// LocalDate's of static method is used to create a new LocalDate object
	// here are the parameter in the sequence as year,month and date
		LocalDate from = LocalDate.of(2020, 5, 4);
        LocalDate to = LocalDate.of(2022, 10, 10);

        Period period = Period.between(from, to);

        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.print(period.getDays() + " days");
	}

}
