package com.interview.intrerface;

import java.util.HashSet;
import java.util.Set;

class Test{
	@Override
	public int hashCode(){
		System.out.println("hashCode called for object: " + this);
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		 System.out.println("equals called: this = " + this + ", obj = " + obj);
		return true;
	}
}
public class Sample{
	public static void main(String arg[]){
		Set<Test> map = new HashSet<Test>();
		for(int  i=0; i<5; i++){
			map.add(new Test());
		}
		System.out.println(map.size());
	}
}
