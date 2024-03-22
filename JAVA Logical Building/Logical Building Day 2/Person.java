class Person
{
	int age;
	double height;
	double weight;
	
	Person(int a, double h, double w)
	{
		age = a;
		height = h;
		weight = w;
	}

	public void display()
	{
		System.out.println("Person's age " + age);
		System.out.println("Person's height " + height);
		System.out.println("Person's weight " + weight);
	}

public static void main(String[] args)
	{
		Person p1 = new Person(21, 6.78, 60.5);
		Person p2 = new Person(22, 10.8, 69.5);
		Person p3 = new Person(23, 8.09, 80.5);
		Person p4 = new Person(24, 12.78, 40.5);

		p1.display();
		p2.display();
		p3.display();
		p4.display();

	}




}