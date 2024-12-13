package com.day5;



 interface Myinterface12 {// not class
		
		
		
		void myAbstractMethod1();//by default public ,abstract
		
		
	}

	interface Myinterface23 extends  Myinterface12 {
		
		void myAbstractMethod2(); 
	}

	class MyNormalClass12 implements Myinterface23 {

		@Override
		public void myAbstractMethod1() {
			
			System.out.println("My abstract method-1");
			
		}

		@Override
		public void myAbstractMethod2() {
			
			System.out.println("My abstract method-2");
		}
		
		
	}
	public class InterfaceExtends {
		

		public static void main(String[] args) {
			
			Myinterface23 concrete = new MyNormalClass12();
			
			concrete.myAbstractMethod1();
			concrete.myAbstractMethod2();
			
			
//			Myinterface concrete ;
//			concrete = new MyNormalClass();
//			concrete.myAbstractMethod1();
//			concrete.myAbstractMethod2();
//			

		}

	}


	
