package com.interview.ex;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/*It looks like you're trying to group elements of an array or 
list based on their consecutive differences. Specifically, you want 
to group consecutive numbers into groups where the difference between 
consecutive numbers is 1. Once grouped, you want to count how many such groups are formed.
*/
public class prg3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int sizeofnum = sc.nextInt();
		
		List<Integer> lstinte = new ArrayList<>();
		int num = 1;
		System.out.println("Enter values : ");
		while(num <= sizeofnum){
			lstinte.add(sc.nextInt());
			num ++;
		}
		System.out.println("Entered values are : "+lstinte);
		num = 1;
		for (int i = 0; i < lstinte.size(); i++) {
//			System.out.println("at i : "+lstinte.get(i));
//			System.out.println(lstinte.get(i - 1)+1);
			if(i != lstinte.size()-1){
//				System.out.println("out : ");
//				System.out.println(lstinte.get(i + 1) - lstinte.get(i));
				int rst = lstinte.get(i + 1) - lstinte.get(i);
				if(rst != 1 ){
					
					num = num +1;
//					System.out.println("nn : "+num);
				}
				
			}
		}
		System.out.println("with out sorting count : "+num);
		Collections.sort(lstinte);
		System.out.println("sorted values  are : "+lstinte);
		num = 1;
		for (int i = 1; i < lstinte.size(); i++) {
			
			if(lstinte.get(i) != lstinte.get(i - 1)+1){
				num = num+1;
			}	
			
			
		}
		
		System.out.println("with sorting count : "+num);
	}

}
