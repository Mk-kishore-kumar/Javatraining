package com.day6;

public class ObjectAssignment {

	 int a = 10;
	 
	 @Override
	protected void finalize() throws Throwable {
		
		 System.out.println("iam finalize");
	}
	
	public static void main(String[] args) {
		
//		ObjectAssignment obj1 = new ObjectAssignment();
//		ObjectAssignment obj2 = new ObjectAssignment();
		
//		System.out.println(obj1.a);
//		System.out.println(obj2.a);
		
		ObjectAssignment obj1 = new ObjectAssignment();
		ObjectAssignment obj2 = obj1;
		
		obj1.a = 20;
		
		System.out.println(obj2.a);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		// suppose here if we use gc() means we have to dereference both object
		
		obj1 = null;
		//obj2 = null;
		System.gc();// it will not call finalize()

	}

}
