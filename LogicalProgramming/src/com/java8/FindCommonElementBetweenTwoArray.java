package com.java8;

import java.util.List;
import java.util.Arrays;

public class FindCommonElementBetweenTwoArray {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

		list1.stream().filter(num -> list2.contains(num)).forEach(System.out::println);
	}

}
