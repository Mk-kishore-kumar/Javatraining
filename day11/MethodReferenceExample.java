package com.day11;

interface MyReference {//mandatory

	void showMessage();
}

public class MethodReferenceExample {

	void myinstanceMethod() {
		System.out.println("Example for my instance method reference");
	}

	static void myStaticMethod() {
		System.out.println("Example for my static method reference");
	}

	MethodReferenceExample() {

		System.out.println("constructor");
	}

	public static void main(String[] args) {
		// reference to a Instance Method
		MethodReferenceExample obj = new MethodReferenceExample();// calling constructor
		MyReference reference = obj::myinstanceMethod;
		reference.showMessage();

		// reference to static method
		reference = MethodReferenceExample::myStaticMethod;
		reference.showMessage();

		// reference to constructor

		reference = MethodReferenceExample::new;
		reference.showMessage();

	}

}
