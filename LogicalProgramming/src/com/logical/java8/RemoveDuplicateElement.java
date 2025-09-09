package com.logical.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class RemoveDuplicateElement {

	public static void main(String[] args) {
		
	List<String> listOfString =	Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
	
	List<String> uniqueElement	 = listOfString.stream().distinct().collect(Collectors.toList());
	
	System.out.println(uniqueElement);
        

	}

}
