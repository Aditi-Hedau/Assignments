class Vehicle
{
	double price;
	String color;
	long model;

	Vehicle(double p, String c, long m)
	{
		price = p;
		color = c;
		model = m; 
	}
	
	public void display()
	{
		System.out.println("Vehicle Details: ");
        	System.out.println("Price: $" + price);
        	System.out.println("Color: " + color);
        	System.out.println("Model: " + model);
	}

public static void main(String[] args)
	{
		Vehicle v1 = new Vehicle(28890 , "Black" , 65714);

		v1.display();


	}



}