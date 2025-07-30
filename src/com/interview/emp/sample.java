package com.interview.emp;

import java.util.Iterator;

public class sample {
	
	
	
	public static void main(String[] args) {
		
		//reverse String
		
		String str = "fd";
		
		int legth = str.length();
		
		for (int i = legth-1; i >= 0 ; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		StringBuilder st = new StringBuilder(str);
		System.out.println(st.reverse());
		System.out.println("-----");
		StringBuffer stb = new StringBuffer(str);
		System.out.println(stb.reverse());
		
	}
			

}
