package com.interview.emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class SecondHighestSalary {
	
	public static void main(String[] args) {
		List<emppojo> emp = new ArrayList<>(Arrays.asList(
				new emppojo(1, "sushma", "java", 10000),
				new emppojo(2, "ww", ".net", 10000),
				new emppojo(3, "dd", "pythn", 200),
				new emppojo(4, "ff", ".net", 60000),
				new emppojo(5, "rr", "pythn", 10000),
				new emppojo(6, "vv", ".net", 40000),
				new emppojo(7, "ss", "HR", 10000),
				new emppojo(8, "dd", "HR", 40000),
				new emppojo(9, "bb", "java",610000)
				));
		
		Map<String, List<emppojo>> dep = emp.stream().collect(Collectors.groupingBy(emppojo::getDepartment));
//		System.out.println("dep : "+dep);
		
		Set<Entry<String, List<emppojo>>> entrySet = dep.entrySet();
		
		Iterator<Entry<String, List<emppojo>>> iterator = entrySet.iterator();
		while(iterator.hasNext()){
			Entry<String, List<emppojo>> next = iterator.next();
			//System.out.println("key : "+next.getKey());
			//System.out.println("value : "+next.getValue());
		}
		
		Map<String, Optional<Double>> collect = emp.stream()
		.collect(Collectors.groupingBy(emppojo::getDepartment,
				Collectors.collectingAndThen(Collectors.toList(), 
						list -> list.stream().map(emppojo::getSalary)
						.distinct().sorted(Comparator.reverseOrder())
						
						.skip(1)
						.findFirst())));
		
		Iterator<Entry<String, Optional<Double>>> iterator2 = collect.entrySet().iterator();
		while(iterator2.hasNext()){
			Entry<String, Optional<Double>> next = iterator2.next();
//			System.out.println("key : "+next.getKey());
//			System.out.println("value : "+next.getValue());
		}
		
		
		
		emp.stream().collect(Collectors.groupingBy(emppojo::getDepartment))
		.forEach((dep1,empl) -> {empl.stream().map(emppojo::getSalary)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.ifPresent(sal -> System.out.println("dep : "+dep1+"sal : "+sal));
		});
		
	}

}
