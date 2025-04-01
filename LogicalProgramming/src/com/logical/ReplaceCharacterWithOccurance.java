package com.logical;

public class ReplaceCharacterWithOccurance {

	public static void main(String[] args) {

		String str = "OPENTEXT";
		
		char replace = 'T';

		char[] chArr = str.toCharArray();
		int count=1;
		for(int i =0 ; i < chArr.length ; i++) {
			
			if(chArr[i] != replace) {
				
				System.out.println("Character is not present in given String");
			} else {
				
				chArr[i]= String.valueOf(count).charAt(0);
				
				count++;
			}
		}
		System.out.println(chArr);
		
		//approarch 2
		int count1 = 1;
		
		for(int i = 0; i< str.length() ; i++) {
			
			if(str.charAt(i) == replace) {
				
			str = str.replaceFirst(String.valueOf(str.charAt(i)), String.valueOf(count1));
			count1++;
			}
			
		}
		
		System.out.println(str);

	}
}
