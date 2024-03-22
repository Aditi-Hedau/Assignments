package in.cdac.acts;

import java.util.Scanner;
public class BMICalculator 
{
	double height;
	double weight;
	
	public BMICalculator(double height, double weight)
	{
		this.height = height;
		this.weight = weight;	
	}
	
	public double getHeight() 
	{
		return height;
	}

	public void setHeight(double height) 
	{
		this.height = height;
	}

	public double getWeight() 
	{
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double calculateBMI()
	{
		return weight / (height * height);
	}


	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Height : ");
		double height = sc.nextDouble();
		
		System.out.print("Enter Weight : ");
		double weight = sc.nextDouble();
		
		BMICalculator c = new BMICalculator(height, weight);
		
		double bmi = c.calculateBMI();
		
		System.out.println("Your BMI is : " +bmi);
		
		sc.close();

	}

}
