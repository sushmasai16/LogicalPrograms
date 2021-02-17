package com.prg.swapno;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int num1 =10 , num2=20 ; 
		
		int temp = 0;
		System.out.println("Numbers before swaping : num1 : "+num1 +" num2 : "+num2);
		temp = num1;
		num1=num2;
		num2=temp;
		System.out.println("Numbers before swaping : num1 : "+num1 +" num2 : "+num2);
	}

}
