package in.cdac.acts;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter date & time in dd/mm/yyyy hh:mm:ss format : ");
		String inputDateTime = scanner.nextLine();
		
		DateFormat inputDateTimeFormat = new SimpleDateFormat("dd/mm/yy  hh:mm:ss");
		
		  try {
	           
			  	Date dateTime = inputDateTimeFormat.parse(inputDateTime);
	            
	            DateFormat outputDateTimeFormat1 = new SimpleDateFormat("dd/mm/yyyy  hh:mm:ss");
	            DateFormat outputDateTimeFormat2 = new SimpleDateFormat("mm/dd/yyyy  hh:mm:ss a");
	            DateFormat outputDateTimeFormat3 = new SimpleDateFormat("yyyy/mm/dd  hh:mm");
        
	            System.out.println("Date & Time in dd/mm/yyyy hh:mm:ss format: " + outputDateTimeFormat1.format(dateTime));
	            System.out.println("Date & Time in mm/dd/yyyy hh:mm:ss a format: " + outputDateTimeFormat2.format(dateTime));
	            System.out.println("Date & Time in yyyy/mm/dd hh:mm format: " + outputDateTimeFormat3.format(dateTime));
		  }
		  catch(ParseException e)
		  {
			  System.out.println("Invalid date & time format. Please enter date & time in dd/mm/yyyy  hh:mm:ss format.");
	       }
			  
		scanner.close();
	}

}
