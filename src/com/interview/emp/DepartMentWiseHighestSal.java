package com.interview.emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DepartMentWiseHighestSal {
	
	
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
		
		
		emp.stream().
		filter(sal -> sal.getDepartment().equalsIgnoreCase("java") && sal.getSalary() > 60000)
		
		.map(sal ->  sal.getSalary())
			
		.mapToInt(Double::intValue)
		.distinct()
		.sorted()
		.findFirst()
		.ifPresent(sal -> System.out.println("higest sal"+sal));
		
		
		
		
		 List<Integer> collect3 = emp.stream()
		.map(emppojo::getSalary)
		.distinct()
		.sorted()
//		.mapToInt(sal -> Double::intValue)
		.mapToInt(Double::intValue)
		.boxed()
		.collect(Collectors.toList());
//		.collect(Collectors.toList());
		 
		 
		 
		 emp.stream().collect(Collectors.groupingBy(emppojo::getDepartment,
				 Collectors.collectingAndThen(
						 Collectors.maxBy(
								 Comparator.comparing(emppojo::getSalary)),
						 Optional::get
								 
						 )
				 	)
				 ).forEach((dep,empo) -> System.out.println("depname : "+dep+" empo : "+empo.getSalary()));;
		 
		
		//System.out.println("all salay : "+collect3);
//				 emp.stream().collect(
//							Collectors.groupingBy(emppojo::getDepartment))
//				 .forEach((d,e) -> System.out.println("ddd : "+d+" eeee : "+e));
		
				 
				 
				 emp.stream()
		            .collect(Collectors.groupingBy(emppojo::getDepartment)) // Group by department
		            .forEach((dep, empList) -> {
		                empList.stream()
//		                    .mapToInt(emppojo::getSalary) // Extract salaries
		                .map(emppojo::getSalary)
						.mapToInt(Double::intValue)
		                    .max() // Find the highest salary
		                    .ifPresent(highestSal -> 
		                        System.out.println("Department: " + dep + ", Highest Salary: " + highestSal)
		                    );
		            });		 
				 
//				 Comparator.reverseOrder()
		emp.stream().collect(
				Collectors.groupingBy(emppojo::getDepartment)
				
				).forEach((dep,empobj) -> {
					empobj.stream()
						.map(emppojo::getSalary)
						.mapToInt(Double::intValue)
						.max()
						.ifPresent(sal -> System.out.println("deppppp : "+dep+"highest salary : "+sal));
				});
				
		
		
		emp.stream().collect(Collectors.groupingBy(
				emppojo::getDepartment, 
				Collectors.collectingAndThen(
						Collectors.toList(), 
						list -> list.stream()
								.map(emppojo::getSalary)
								.distinct()
								.sorted(Comparator.reverseOrder())
								.skip(1)
								.findFirst()
						)
				
				)).forEach((d,s)->System.out.println("dddd : "+d+"sallll : "+s));
		
		
		Map<String, List<emppojo>> collect = emp.stream().collect(Collectors.groupingBy(emppojo::getDepartment));
		
		
//		collect.forEach((name,emp1) -> System.out.println("name : "+name+" emp : "+emp1));
		
		
		Map<String, emppojo> collect2 = emp.stream().
		collect(
				Collectors.groupingBy(emppojo::getDepartment,
				Collectors.collectingAndThen(
						Collectors.maxBy(
								Comparator.comparing(emppojo::getSalary)
								), Optional::get
						)
				)
		);
		
		//collect2.forEach((depname,empobj) -> System.out.println("depname : "+depname+" empojo : "+empobj));
	
//		  emp.stream().
//			collect(
//					Collectors.groupingBy(emppojo::getDepartment)
//			).forEach((dep,empo) -> {
//				empo.stream().map(emppojo::getSalary)
//				.distinct()
//				.sorted()
//				.skip(1)
//				.findFirst()
//				.ifPresent(sal -> System.out.println(" dep : "+dep+"sal : "+sal));
//			});
	
//		  emp.stream()
		 
		  
		  List<emppojo> empdep = new ArrayList<>(Arrays.asList(
					new emppojo(1, "sushma", 1000, 1),
					new emppojo(2, "ww", 1000, 2),
					new emppojo(3, "dd", 1500, 3),
					new emppojo(4, "ff", 5000, 2),
					new emppojo(5, "rr", 6000, 3),
					new emppojo(6, "vv", 2000, 2),
					new emppojo(7, "ss", 2000, 4),
					new emppojo(8, "dd", 10000, 4),
					new emppojo(9, "bb", 3000,1)
					));
		  
		  
//		  Map<Integer, emppojo> collect2 = empdep.stream().collect(
//				  Collectors.groupingBy(
//				  emppojo::getDepid,
//				  Collectors.collectingAndThen(
//						  Collectors.maxBy(Comparator.comparing(emppojo::getSalary)),
//						  Optional::get)	  
//						  )
//				  );
//		  collect2.forEach((depid,empobj) -> System.out.println("depid : "+depid+" emp : "+empobj));
	
//		  System.out.println("========================");
//		  empdep.stream().collect(Collectors.groupingBy(emppojo::getDepid))
//		  .forEach((depid,emppsec) -> {
//			  emppsec.stream().map(emppojo::getSalary)
//			  .distinct()
//			  .sorted()
////			  .skip(1)
//			  .findFirst()
//			  .ifPresent(salaray -> System.out.println("depi : "+depid+" salary : "+salaray));
//		  });
		  
		  
		  
	}

}
