package in.cdac.acts;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter time in hh:mm:ss format : ");
		String inputTime = scanner.nextLine();
		
		DateFormat inputTimeFormat = new SimpleDateFormat("hh:mm:ss");
		
		  try {
	           
	            Date time = inputTimeFormat.parse(inputTime);
	            DateFormat outputTimeFormat1 = new SimpleDateFormat("hh:mm:ss");
	            DateFormat outputTimeFormat2 = new SimpleDateFormat("hh:mm:ss a");
	            DateFormat outputTimeFormat3 = new SimpleDateFormat("hh:mm");
        
	            System.out.println("Time in hh:mm:ss format: " + outputTimeFormat1.format(time));
	            System.out.println("Time in hh:mm:ss a format: " + outputTimeFormat2.format(time));
	            System.out.println("Time in hh:mm format: " + outputTimeFormat3.format(time));
		  }
		  catch(ParseException e)
		  {
			  System.out.println("Invalid time format. Please enter date in hh:mm:ss format.");
	       }
			  
		scanner.close();
	}

}
