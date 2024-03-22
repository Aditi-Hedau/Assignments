import java.util.Scanner;
class Fourteenth
{  
	public static void main(String args[])
	{  
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number ");
		int n=sc.nextInt();
		int fact=1;
		int i=0;
  		do
		{
			fact = fact*i;
			i++;
		}while(i<=n);    
  		System.out.println("Factorial of "+n+" is: "+fact);     
	}  
}  