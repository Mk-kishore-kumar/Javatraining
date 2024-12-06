package com.day3;
class Employee2{
	
	 private int eid;//less visiblity
	 private String name;
	 private double salary;
	 
//contructing object using constructor
//It will used for initializing initial data
	 
	public Employee2(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

    
	public int getEid() {//modified the fields not object ex.salary
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}



public class BeanClass {
	
	 

	public static void main(String[] args) {
		Employee2 e1 =  new Employee2(101,"kishore",78000);
		System.out.println("-----Initial Data-----");
		System.out.println(e1.getEid());
		System.out.println( e1.getName());
        System.out.println(e1.getSalary()); 
        
        System.out.println();
        
        e1.setSalary(90000);
        
        System.out.println("-----After Modified the fields-----");
        
        System.out.println(e1.getEid());
		System.out.println( e1.getName());
        System.out.println(e1.getSalary());
        
      
        
	}

}
