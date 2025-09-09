package com.logical.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShortRemoveDuplicateFromArray {
	
	public static void main(String[] args) {
		
		int[] a= new int[] {2,3,0,5,1,1,2};
		
		Arrays.stream(a).sorted().distinct().forEach(System.out::print);
		
	}

}
