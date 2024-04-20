import java.util.Scanner;

public class LCM
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter number2 : ");
		int num2 = sc.nextInt();
		sc.close();
		int lcm = findLCM(num1, num2);
		System.out.println("LCM of " +num1+ " and " +num2+ " is " +lcm);
	}
	
	public static int findLCM(int num1, int num2)
	{
		return (num1 * num2) / findGCD(num1, num2);
	}

	public static int findGCD(int num1, int num2)
	{
		if(num2==0){
			return num1;
		}
		return findGCD(num2, (num1%num2));
	
	}




}