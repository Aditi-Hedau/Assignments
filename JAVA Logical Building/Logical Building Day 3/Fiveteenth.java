import java.util.Scanner;
class Fiveteenth
{  
	public static void main(String args[])
	{  
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number ");
		int n=sc.nextInt();
		int sum =0;
  		do
		{
			sum = sum+(n%10);
			n=n/10;
		}while(n!=0);    
  		System.out.println("Sum of digit of number " +sum);     
	}  
}  