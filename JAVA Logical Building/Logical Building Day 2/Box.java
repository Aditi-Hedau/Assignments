class Box						// creating class
{
	double height;
	double width;
	double breadth;
	
	Box(double h, double w, double b)		// function of class
		{
			height = h;
			width = w;
			breadth = b;
		}

	double getVolume()				// calculating volume
		{
			return height * width * breadth;
		}

	double getArea()				// calculating area
		{
			return width * breadth;
		}

public static void main(String[] args)			// main method
	{
		Box b1 = new Box(6, 7.2, 4);		// creat instance of class
		Box b2 = new Box(4, 3.8, 7.9);		// creat instance of class

		System.out.println("Volume of Box1 is : " + b1.getVolume());
		System.out.println("Area of Box1 is : " + b1.getArea());

		System.out.println("Volume of Box2 is : " + b2.getVolume());
		System.out.println("Area of Box2 is : " + b2.getArea());
	}
	


















}