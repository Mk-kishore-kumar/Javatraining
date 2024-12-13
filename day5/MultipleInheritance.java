package com.day5;

// multipleinheritance only by extends keyword because inheritance


interface One {
	
	int a = 10;
// interface variable by default public,static final
	
}

interface Two {
	
	int a = 20;// public static final****
	
}

interface Three extends One, Two {// allow to inherit multiple interface****
	
	void sum();
	
}

class NormalClass implements Three {
	
	public void sum() {
	
		System.out.println("Sum is: "+(One.a+ Two.a));
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		
		NormalClass normal = new NormalClass();
		normal.sum();

	}

}
