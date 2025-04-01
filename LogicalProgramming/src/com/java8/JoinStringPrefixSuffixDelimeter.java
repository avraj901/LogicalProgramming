package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringPrefixSuffixDelimeter {

	public static void main(String[] args) {

		List<String> listOfString = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

		String joinedStr = listOfString.stream().collect(Collectors.joining(",", "[", "]"));

		System.out.println(joinedStr);
	}
}
