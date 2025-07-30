package com.interview.third.highest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.interview.emp.emppojo;

public class ThirdHighestSal {
	
	public static void main(String[] args) {
		
		
		List<emppojo> emp = new ArrayList<>(Arrays.asList(
				new emppojo(1, "sushma", "java", 10000),
				new emppojo(2, "ww", ".net", 10000),
				new emppojo(3, "dd", "pythn", 200),
				new emppojo(4, "ff", ".net", 20000),
				new emppojo(5, "rr", "pythn", 10000),
				new emppojo(6, "vv", ".net", 40000),
				new emppojo(7, "ss", "HR", 50000),
				new emppojo(8, "dd", "HR", 40000),
				new emppojo(9, "bb", "java",610000)
				));
		
		Optional<Double> findthirdSal = emp.stream().map(emppojo::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst();
		
		if(findthirdSal.isPresent()) {
			System.out.println("third highest salary : "+findthirdSal);
		}
//		emp.stream().map(emppojo::getDepartment).forEach(sal -> System.out.println("iiii : "+sal));
		
//		System.out.println("sla : "+map);
		
		boolean anyMatch = emp.stream().anyMatch((emps) -> emps.getDepartment().equals("HR"));
		
		
		System.out.println("asdasd : "+anyMatch);
		
		
		
			Optional<Double> findFirst = emp.stream().map(emppojo::getSalary).sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst();	
			System.out.println("third : "+findFirst);
	}

}
