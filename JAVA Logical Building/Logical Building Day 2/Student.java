class Student								// creating Class
{
	String name= "JOE";
	double subject1= 79;
	double subject2= 68;
	double subject3= 80;

	double computeTotalMarks()					// calculate total marks
		{
			return subject1 + subject2 + subject3;
		}

	double computeAverageMarks()					// calculate total average
		{
			return computeTotalMarks() / 3;
		}

public static void main(String[] args)					// main method
	{
		Student student1 = new Student();			// create instance of class

		System.out.println("Student: " + student1.name);
		System.out.println("Total Marks: " + student1.computeTotalMarks());
        	System.out.println("Average Marks: " + student1.computeAverageMarks());
    	}
	
}