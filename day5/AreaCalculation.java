package com.day5;

//declaring comman funtions in shapes class

abstract class Shapes {
	
	int length;
	int breath;
	int side;
	int height;
	
	//each funtion have differnt parameter
	// constructor overloading
	public Shapes(int length, int breath) {
		
		this.length = length;
		this.breath = breath;
	}
	

	public Shapes(int side) {
	
		this.side = side;
	}


	public Shapes(int length, int breath, int height) {
		
		this.length = length;
		this.breath = breath;
		this.height = height;
		
	}
	
	abstract void area();// absract method
	
	
}// end of superclass

class Rectangle extends Shapes {

	public Rectangle(int length, int breath) {
		
		super(length, breath);
		
		
		
	}
	

	void area() {
		
		System.out.println("Area of rectangle  :"+(length*breath));
	}
	
	
	
}// end of rectangle class

// hierarchical inheritance

class Square extends Shapes {

	public Square(int side) {
		
		super(side);
		
	}
	
	void area() {
		
		System.out.println("Area of square :"+(side*side));
	}
	
	
	
	
}//end of shape class

class Triangle extends Shapes {

	public Triangle(int length, int breath, int height) {
		
		super(length, breath, height);
		
	}
	
	@Override
	void area() {
		
		System.out.println("Area of triangle is: "+(length*breath*height));
	}
	
}
public class AreaCalculation {

	public static void main(String[] args) {
		
		Shapes shapes;
		shapes = new Rectangle(5,6);
		shapes.area();
        shapes = new Square(2);
        shapes.area();
        shapes = new Triangle(2,2,3);
        shapes.area();
       
	}

}
