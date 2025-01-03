package com.interview.streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
	
	public static void main(String args[]) {
		
		String name = "sushma";
		
		for(int i = name.length() -1 ; i >= 0 ; i--) {
			System.out.print(name.charAt(i));
		}
		
		String rev=IntStream.range(0, name.length())
        .mapToObj(i -> name.charAt(name.length() - i - 1))
        .map(String::valueOf)
        .collect(Collectors.joining());
		System.out.println("rev : "+rev);
		//palindrom
		int num = 101;
		
		
		int temp = 0;
		while(num > 0) {
			//System.out.println(temp * 10+" "+num % 10);
			temp = temp * 10 + num % 10;
			//System.out.println("- "+num / 10);
			num = num / 10;
		}
		System.out.println("temp : "+temp);
		
		
		// febonace
		int f = 13;
		int fn = 0;
		int sn = 1;
		int lastn = 0;
		System.out.print(fn+" "+sn+" ");
		while(sn < f) {
			int ff = fn;
			temp = sn;
			sn = fn + sn;
			fn = temp;
			System.out.print(sn +" ");
			if(sn == f || sn > f) {
				System.out.println();
				System.out.println( ff+" "+fn);
			}
			
		}
		// prime number
		num = 12;
		boolean bb = true;
		for(int i = 2; i< num ; i++) {
			if(num % i == 0) {
				System.out.println("prime number : "+num);
				bb = false;
				break;
			}
			
		}
		
		if(bb){
			System.out.println("not prime number : "+num);
		}
		
	}

}
