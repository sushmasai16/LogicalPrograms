package com.prg.swapno;

/**
 * @author HOME
 *
 */
public class SwapTwoNumUsingPlusAndMinusOperators {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println("Numbers before swaping : num1: "+num1 +" num2: "+num2);
		num1 = num1 + num2;
		num2=num1 - num2;
		num1=num1 - num2;
		System.out.println("Numbers before swaping : num1: "+num1 +" num2: "+num2);
	}
}
