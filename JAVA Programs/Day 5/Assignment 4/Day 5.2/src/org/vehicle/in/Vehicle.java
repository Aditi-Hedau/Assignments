package org.vehicle.in;

public class Vehicle 
{
	private String name;
	private String color;
	private String vehicleNo;
	
	public void setDetails(String name)
	{
		this.name = name;
	}
	
	public void setDetails(String name, String color)
	{
		this.name = name;
		this.color = color;
	}
	
	public void setDetails(String name, String color, String vehicleNo)
	{
		this.name = name;
		this.color = color;
		this.vehicleNo = vehicleNo;
	}
	
	public void displayDetails() 
	{
        System.out.println("Vehicle Name: " + name);
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle Number: " + vehicleNo);
	}
	
	public static void main(String[] args) 
	{
		Vehicle vehicle = new Vehicle();

        vehicle.setDetails("Car");
        vehicle.displayDetails();

        System.out.println();

        vehicle.setDetails("Bike", "Red");
        vehicle.displayDetails();

        System.out.println();

        vehicle.setDetails("Truck", "Blue", "XYZ123");
        vehicle.displayDetails();
		

	}

}
