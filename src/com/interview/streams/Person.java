package com.interview.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
	
	int id;
    String name;
    List<String> mobileNos;
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public List<String> getMobileNos() {
        return mobileNos;
    }
 
    public Person(int id, String name, List<String> mobileNos) {
        this.id = id;
        this.name = name;
        this.mobileNos = mobileNos;
    }
 
    public void setMobileNos(List<String> mobileNos) {
        this.mobileNos = mobileNos;
    }
    
    public static void main(String[] args) {
    	List<String> mobileNos = new ArrayList<>();
    	mobileNos.add("98765");
    	mobileNos.add("12344");
    	Person number = new Person(1,"sushma",mobileNos);
    	mobileNos = new ArrayList<>();
    	mobileNos.add("98675");
    	mobileNos.add("12344456");
    	Person number2 = new Person(2,"tt",mobileNos);
    	
    	List<Person> personList =  new ArrayList<>();
    	personList.add(number);
    	personList.add(number2);
    	
    	
    	
    	List<String> mobileNumbers = personList.stream()
    			.flatMap(p -> p.getMobileNos().stream()).distinct().collect(Collectors.toList());
    	System.out.println("mobilenmbers : "+mobileNumbers);
    	
    	mobileNumbers = mobileNos.stream().collect(Collectors.toList());
    	System.out.println("only number : "+mobileNumbers);
    	
    	List<String> names = personList.stream().map(Person::getName).collect(Collectors.toList());
    	System.out.println("names : "+names);
    	
    	List<String> num = personList.stream().flatMap(prb -> prb.getMobileNos().stream()).distinct().sorted().collect(Collectors.toList());
    	System.out.println("my umbers : "+num);
    }

}
