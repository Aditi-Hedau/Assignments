package in.cdac.acts;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter date in dd/mm/yyyy format : ");
		String inputDate = scanner.nextLine();
		
		DateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		  try {
	           
	            Date date = inputDateFormat.parse(inputDate);
	            DateFormat outputDateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
	            DateFormat outputDateFormat2 = new SimpleDateFormat("MM-dd-yyyy");
	            DateFormat outputDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
        
	            System.out.println("Date in dd-MM-yyyy format: " + outputDateFormat1.format(date));
	            System.out.println("Date in MM-dd-yyyy format: " + outputDateFormat2.format(date));
	            System.out.println("Date in yyyy-MM-dd HH:mm:ss format: " + outputDateFormat3.format(date));
		  }
		  catch(ParseException e)
		  {
			  System.out.println("Invalid date format. Please enter date in dd/mm/yyyy format.");
	       }
			  
		scanner.close();
	}

}
