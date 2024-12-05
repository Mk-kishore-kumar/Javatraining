package com.day2;

//class and object
class Employee1 {
	
	 int eid;
	 String name ;
	 double esalary;
	 
	 //Constructor
	
	  Employee1(int eid, String name, double esalary) {
		
		this.eid = eid;
		this.name = name;
		this.esalary = esalary;
		
		this.display();//current class method calling
	}
	  Employee1()
	  {
		  this(101,"kishore",30000);//current class constructor calling
		  
	  }
	  
	public void display() {
		 
		 System.out.println("Employee id : " + eid);
		 System.out.println("Employee name : " + name);
		 System.out.println("Employee salary : " + esalary);
	 }
}

public class ThisKeyWord {

	public static void main(String[] args) {
		
		Employee1 e1= new Employee1();//0 args cons
		
	}

}
