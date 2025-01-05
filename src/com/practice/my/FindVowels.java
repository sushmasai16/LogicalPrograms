package com.practice.my;

import java.util.function.Predicate;

public class FindVowels {
	
	public static void main(String[] args) {
		String str = "sushma";
		
		String regexp = ".*[aeiou].*";
		
		System.out.println(str.matches(regexp));
		
//		str.chars().anyMatch(regexp);
		
		Predicate<Character> isVowel = c -> {
			System.out.println("ccc : "+"aeiouAEIOU".indexOf(c));
			return "aeiouAEIOU".indexOf(c) != -1;
					};
		
		boolean anyMatch = str.chars().mapToObj(c -> (char) c).anyMatch(isVowel);
		System.out.println(anyMatch);
		
	}

}
