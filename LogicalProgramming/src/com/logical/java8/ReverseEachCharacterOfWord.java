package com.logical.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class ReverseEachCharacterOfWord {

	public static void main(String[] args) {
		
	List<String> listString = Arrays.asList("ABC","123ABC","DEG", "34H");
	
	//List<StringBuilder> output =  listString.stream().map(word -> new StringBuilder(word).reverse()).collect(Collectors.toList());
	
	//System.out.print(output);
	
	listString.stream().map(ReverseEachCharacterOfWord::reverseString).forEach(System.out::println);
	
	}
	
	public static String reverseString(String word) {
		 
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		
		StringBuilder sb2= new StringBuilder();
		
	 for(char c : word.toCharArray()) {
		 
		 if(Character.isLetter(c)) {
			 sb.append(c);
		 } else {
			sb1.append(c); 
		 }
		 
	 }
	 sb.reverse();
	 sb1.reverse();
		
		return sb1.append(sb).toString();
	}
}
