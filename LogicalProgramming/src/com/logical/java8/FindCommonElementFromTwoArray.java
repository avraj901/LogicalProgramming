package com.logical.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElementFromTwoArray {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

		List<Integer> commonElements = list1.stream().filter(num -> list2.contains(num)).collect(Collectors.toList());

		System.out.println(commonElements);
	}

}
