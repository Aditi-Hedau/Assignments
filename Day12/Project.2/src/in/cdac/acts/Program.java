package in.cdac.acts;

class Rectangle {
	float length;
	float breadth;
	private float area;

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

	public float getArea() {
		return this.area;
	}
}

class Circle {
	float radius;
	private float area;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		this.area = (float) (Math.PI * Math.pow(this.radius, 2));
	}

	public float getArea() {
		return this.area;
	}
}

public class Program {

	 public static void main(String[] args) {
			Circle c = new Circle();
			c.setRadius(10.5f);
			c.calculateArea();
			System.out.println(" Area of CIRCLE : " + c.getArea());

		}
	
	public static void main1(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setLength(10.5f);
		rect.setBreadth(2.5f);
		rect.calculateArea();
		System.out.println(" Area of RECTANGLE : " + rect.getArea());
	}

}
