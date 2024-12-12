package com.day4;

class Employee {
	static private Employee emp = null;
	
	private Employee() {
		
	}
	
	public static Employee getEmployee() {
		
		if(emp == null) 
			emp = new Employee();
		else
			emp = null;
		return emp;// it must final
			
		}
	
	public void display() {
		
		System.out.println("Employee");
	}
	
	
}
public class SingleTonClass {

	public static void main(String[] args) {
		Employee emp = Employee.getEmployee();
		emp.display();

	}

}
