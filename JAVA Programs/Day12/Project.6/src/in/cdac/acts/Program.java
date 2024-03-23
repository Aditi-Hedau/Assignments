package in.cdac.acts;

import java.util.Scanner;

class Shape {
	protected float area;

	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public void calculateArea() {

	}

	public float getArea() {
		return this.area;
	}
}

class Rectangle extends Shape {
	private float length;
	private float breadth;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public void setLength(float length) {
		this.length = length;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	public void calculateArea() {
		this.area = this.length * this.breadth;
	}

}

class Circle extends Shape {
	private float radius;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		this.area = (float) (Math.PI * Math.pow(this.radius, 2));
	}

}

class ShapeTest {
	private Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	private static Scanner sc = new Scanner(System.in);

	public void acceptRecord() {
		if( this.shape != null ) {
			if(shape instanceof Rectangle) {
			Rectangle rect = (Rectangle) shape; // Downcasting
			System.out.print(" Rectangle Length : ");
			rect.setLength(sc.nextFloat());
			System.out.print(" Rectangle Breadth : ");
			rect.setBreadth(sc.nextFloat());
		} else {
			Circle c = (Circle) shape; // Downcasting
			System.out.print(" Circle Radius : ");
			c.setRadius(sc.nextFloat());
			}
		}
		shape.calculateArea();
	}

	public void printRecord() {
		if( this.shape != null ) {
			System.out.print(" Area : " + shape.getArea());
		}
	}
	
	public static int menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Rectangle");
		System.out.println("2. Circle");
		System.out.print("Enter choice: ");
		return sc.nextInt();
	}
}

public class Program {

	public static void main(String[] args) {

		int choice;
		ShapeTest test = new ShapeTest();
		while ((choice = ShapeTest.menuList()) != 0) {
			
			switch (choice) {
			case 1:
				test.setShape( new Rectangle());	//upcasting
				break;

			case 2:
				test.setShape(new Circle());	//upcasting
				break;
			}
				test.acceptRecord();
				test.printRecord();
			}

	}

}

