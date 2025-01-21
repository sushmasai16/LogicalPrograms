package com.interview.intrerface;

 class Child extends Parent {
	 
	 public Child() {
		 System.out.println("constructor Child");
	 }
	public void run() {
		System.out.println(" Child Run");
		super.run();
	}
	public void walk() {
		System.out.println(" Child walk");
		super.walk();
	}
}

 class Parent {
	 public Parent() {
		 System.out.println("constructor Parent");
	 }
	public void run() {
		System.out.println(" Parent Run");
		walk();
		System.out.println(" Parent Run end");
	}
	
	public void walk() {
		System.out.println(" Parent Walk");

	}
}
 
 
 class Child2 extends  Child{
	 
	 
	 public Child2() {
		 System.out.println("constructor Child2");
	 }
	 public void run() {
			System.out.println(" Child---- Run");
			super.run();
		}
		public void walk() {
			System.out.println(" Child--- walk");
			super.walk();
		}
	}

public class Test2 {
	public static void main(String[] args) {
		Child p = new Child2();
		p.run();
	}
}
