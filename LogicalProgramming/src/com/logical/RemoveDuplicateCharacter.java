package com.logical;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		String str = "programming";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			int num = str.indexOf(ch, i + 1);

			if (num == -1) {

				sb.append(ch);
			}

		}

		System.out.println(sb);

		// approach 2
		StringBuilder sb1 = new StringBuilder();
		
		char[] chrArr = str.toCharArray();
		
		System.out.println(chrArr.length);

		for (int i = 0; i < chrArr.length; i++) {
			
			boolean repeated = false;
			
			for (int j = i + 1; j < chrArr.length ; j++) {

				if (chrArr[i] == chrArr[j]) {

					repeated = true;
				}
			}
			if (!repeated) {

				sb1.append(chrArr[i]);
			}

		}
		System.out.println(sb1);
		
		//approach 3
		
		StringBuilder sb3= new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		
		for(int i=0; i < str.length(); i++) {
			
			set.add(str.charAt(i));
			
		}
		for( Character value : set) {
			
			sb3.append(value);
		}
		System.out.println(sb3);
	}
}
