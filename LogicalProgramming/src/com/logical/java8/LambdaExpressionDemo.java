package com.logical.java8;

interface Calculator {
	
	//void switchOn();
	
	int substract(int i1, int i2);
}


public class LambdaExpressionDemo {

	public static void main(String[] args) {
		
	/*	Calculator cl = () -> {
			 System.out.println("Demo for Lambda Expression");
		 };
		 
		 cl.switchOn();*/
		
	Calculator cal=	(i1, i2) -> {
			
			return i1-i2;
			};
			
			int output = cal.substract(15, 8);
			
			System.out.print(output);
	}
	
	

}
