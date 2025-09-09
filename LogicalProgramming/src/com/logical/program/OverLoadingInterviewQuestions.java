package com.logical.program;

public class OverLoadingInterviewQuestions {

	public static void main(String[] args) {
		
		//System.out.println(getSum((Integer)2132222222,(Integer)222344444));
		//System.out.println(getSum((Integer)2132222222,222344444));
		System.out.println(getSum(2132222222,222344444));

	}
	
	public static int getSum(int a, int b) {
		
		System.out.println("from primitive data Types");
		return a+b;
	}
	
	public static Integer getSum(Integer x, Integer y) {
		
		System.out.print("From Wrapper class");
		return x+y;
	}

}
