package in.cdac.acts;

import java.util.Scanner;

class Shape{
	protected float area;
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public float getArea() {
		return this.area;
	}
}

class Rectangle extends Shape {
	float length;
	float breadth;

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
	float radius;
	
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

public class Program {

	private static Scanner sc = new Scanner(System.in);

	private static int menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Rectangle");
		System.out.println("2. Circle");
		System.out.print("Enter choice: ");
		return sc.nextInt();
	}
	
	public static void acceptRecord(Rectangle rect) {
		System.out.print(" Rectangle Length : ");
		rect.setLength(sc.nextFloat());
		System.out.print(" Rectangle Breadth : ");
		rect.setBreadth(sc.nextFloat());
	}
	
	public static void printRecord(Rectangle rect) {
		System.out.print(" Area of RECTANGLE : " + rect.getArea());
	}
	
	public static void acceptRecord(Circle c) {
		System.out.print(" Circle Radius : ");
		c.setRadius(sc.nextFloat());
	}
	
	public static void printRecord(Circle c) {
		System.out.print(" Area of CIRCLE : " + c.getArea());
	}
	
	public static void main(String[] args) {
		
		int choice;
		
		while ((choice = Program.menuList()) != 0)
			
			switch (choice) {
			case 1:
				Rectangle rect = new Rectangle();
				Program.acceptRecord(rect);
				rect.calculateArea();
				Program.printRecord(rect);
				break;
				
			case 2:
				Circle c = new Circle();
				Program.acceptRecord(c);
				c.calculateArea();
				Program.printRecord(c);
				break;
			}

	}

}
