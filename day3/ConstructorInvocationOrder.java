package com.day3;
class Doctor {
	Doctor(){
		super();
		
		System.out.println("iam naveen");
	}
}

class Patient extends Doctor {
	
	Patient() {
		this(4);
		System.out.println("Iam Patient");
	}
	
	Patient(int a) {
		super();
		System.out.println("patient 2");
	}
	
	void partha() {
		int a=10;
		System.out.println("iam partha");
		
	}
	void kishore() {
		this.partha();
		System.out.println("kishore");
		
	}
	
	
}
class Hospital extends Patient
{

	public Hospital() {
		
		System.out.println("steven Hope");
	}
	
}

public class ConstructorInvocationOrder {

	public static void main(String[] args) {
		Hospital hos = new Hospital();
		//System.out.println(patient);
	}

}
