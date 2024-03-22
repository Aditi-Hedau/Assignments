package org.example.main;

public class Student 
{
	private String name;
	private int age;
	private int id;
	private String grade;
	
	public void setDetails(String name, int age, int id, String grade)
	{
		this.name = name;
		this.age = age;
		this.id = id;
		this.grade = grade;
	}
	
	public void displayDetails()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Id : " + id);
		System.out.println("Grade : " + grade);
	}
	
	
	public static void main(String[] args)
	{
		Student student = new Student();
		student.setDetails("Anjali", 19, 1036,"B+");
		student.setDetails("Harsh", 20, 1043,"C+");
		student.displayDetails();
        student.displayDetails();

	}

}
