package com.logical.java8;
import java.util.stream.Stream;
import java.util.stream.*;

public class AnagramProgram {

	public static void main(String[] args) {

		String s1 = "RaceCar";
		String s2 = "CarRace";

		String s3 = Stream.of(s1.split("")).map(i -> i.toUpperCase()).sorted().collect(Collectors.joining());
		String s4 = Stream.of(s2.split("")).map(i -> i.toUpperCase()).sorted().collect(Collectors.joining());

		if (s3.equals(s4)) {
			System.out.println("Anagram String : " + s1 +"::"+ s2);
		}

	}

}
