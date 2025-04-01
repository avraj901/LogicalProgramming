package com.logical;

public class RecerseAString {

	public static void main(String[] args) {

		String str = "hello";

		System.out.println(str.length());

		//approach-1
		char[] chrArr = str.toCharArray();

		for (int i = chrArr.length - 1; i >= 0; i--) {

			System.out.print(chrArr[i]);

		}
		
		//approach-2
		System.out.println();
		
		for(int i = str.length()-1; i>=0 ; i--) {
			
			
			System.out.print(str.charAt(i));
		}
		//approach 3
		
		System.out.println();
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(sb.reverse());
		
		//approach 4 
		
		
		StringBuilder strb = new StringBuilder(str);
		
		System.out.println(strb.reverse());
	}
}
