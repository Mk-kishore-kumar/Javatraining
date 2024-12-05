package com.day2;


class Employee {
	
	 int eid;
	 String name ;
	 double esalary;
	
	 public Employee(int eid, String name, double esalary) {
		
		this.eid = eid;
		this.name = name;
		this.esalary = esalary;
	}

	 
	public void display() {
		 
		 System.out.println("Employee id : " + eid);
		 System.out.println("Employee name : " + name);
		 System.out.println("Employee salary : " + esalary);
	 }
}


public class ClassAndObject {

	public static void main(String[] args) {
		
		Employee kishore= new Employee(101, "kishore", 5000000);
		
		 kishore.display();
		 
		 System.out.println();
		 
		Employee sundhar= new Employee(102, "Sundhar", 4000000);
		
		 sundhar.display();
		 
		
	}

}
