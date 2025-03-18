package com.streams.student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentMain {
	
	public static void main(String[] args) {
		
		List<Student> st = Arrays.asList(
				new Student("sushma",60.0),
				new Student("tanvi",72.0),
				new Student("ravi",40.0),
				new Student("sweetha",20.0),
				new Student("suseela",80.0)
				);
		
		
		
		Map<Boolean, List<Student>> collect = st.stream().collect(Collectors.partitioningBy(e -> e.getPercentage() > 60));
		
		System.out.println("above 60");
		collect.get(true).forEach(e -> System.out.println(e.getName()+" :: "+e.getPercentage()));
		
		System.out.println("below 60");
		collect.get(false).forEach(e -> System.out.println(e.getName()+" :: "+e.getPercentage()));
		
		
		st.stream()
		.collect(Collectors.partitioningBy(e -> e.getPercentage() > 60))
		.forEach((k,v) ->{
		System.out.println(k+"::");
		v.forEach(d -> System.out.println(d.getName()));
		}
		);
		
	}

}
