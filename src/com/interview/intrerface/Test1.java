package com.interview.intrerface;

 class A {
	A(){
		System.out.println("A Constructor");
	}
	public void xyz() {
		System.out.println("A. xyz");
	}
}
//////
 class B extends A {
	B(){
		System.out.println("B Constructor");
	}
	public void xyz() {
		System.out.println("B. xyz");
	}
}
////
public class Test1 {
	public static void main(String[] args) {
		A a = new B();
		a.xyz();
	}
}
