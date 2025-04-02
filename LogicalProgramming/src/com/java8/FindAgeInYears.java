package com.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindAgeInYears {

	public static void main(String[] args) {

		LocalDate birthDay = LocalDate.of(1994, 8, 03);
		
		LocalDate current = LocalDate.now();
		
		long between = ChronoUnit.YEARS.between(birthDay, current);
		
		System.out.println(between);
		
	}

}
