package com.logical.java8;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class JoinWithPrefixAndSuffix {

	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
   
		String result = listOfStrings.stream().collect(Collectors.joining(",","[","]"));
		
		System.out.println(result);
	
	
	}

}
