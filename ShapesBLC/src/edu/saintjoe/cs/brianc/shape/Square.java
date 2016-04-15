package edu.saintjoe.cs.brianc.shape;

public class Square extends Shape {
	// Look ma, no data members and no methods!
	
	// Why?  I inherited them!
	public static void main(String[] args) {
		Square mySquare = new Square();
		
		mySquare.sayHello();
	}
}
