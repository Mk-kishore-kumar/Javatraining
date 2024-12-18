package com.day9;

import java.io.FileInputStream;//to read data from file
import java.io.FileOutputStream;// need to import for createing file
import java.io.ObjectInputStream;//to covert file to 0&1 and reading
import java.io.ObjectOutputStream;//for converting file to binary
import java.io.Serializable;// need to import we get exception not serializeble not found

class Employee implements Serializable{
	transient private int id;
	private String name;
	private double esalary;
	
	Employee(int id, String name, double esalary) {
		
		this.id = id;
		this.name = name;
		this.esalary = esalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary){
		this.esalary = esalary;
	}
	
	
}
public class SerializationExample {

	public static void main(String[] args)throws Exception {
		
		Employee obj1 = new Employee(101, "kishore", 20000);
		
		FileOutputStream  fout = new FileOutputStream("C:\\Users\\Kishore Kumar\\Downloads\\serial\\serialexample.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		
		objout.writeObject(obj1);
		fout.close();
		objout.close();
		System.out.println("now permanently stored in fle");
		System.out.println("My Object is saved into file ");
		
		System.out.println("-----------------");
		
		//deserialization
		
		System.out.println("now taking data from file to jvm");
		
		FileInputStream  fin = new FileInputStream("C:\\Users\\Kishore Kumar\\Downloads\\serial\\serialexample.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		
		Employee obj2 = (Employee) objin.readObject();
		
		objin.close();
		fin.close();
		
		System.out.println("Employee id : "+ obj2.getId());
		System.out.println("Employee name : "+ obj2.getName());
		System.out.println("Employee id : "+ obj2.getEsalary());
		

	}

}
