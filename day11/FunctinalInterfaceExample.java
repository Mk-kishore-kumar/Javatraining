package com.day11;


/*
// without lambda expression we will create class and implement method
class Addition implements Myinterface {
	public int calc(int a, int b) {
		return a + b;
	}
}

class Substraction implements Myinterface {

	@Override
	public int calc(int a, int b) {
		
		return a - b;
	}
	
}
*/
@FunctionalInterface
interface Myinterface {
	
	int calc(int a, int b);//public & abstract
	
}
public class FunctinalInterfaceExample {
   public static void main(String[] args) {
	Myinterface ref = (a, b) -> a + b;//on the fly defining
	System.out.println(ref.calc(10, 20));
	
	ref = (a,b) -> a - b;
	
	System.out.println(ref.calc(10, 20));
	System.out.println(ref.calc(100, 200));
	
}
}
