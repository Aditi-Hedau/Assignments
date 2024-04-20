import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("Prime factors of " +num+ " is : ");
		printPrimeFactors(num, 2);
	}

	public static void printPrimeFactors(int num, int divisor)	{
		if(num<=1)
			return;
		if(num % divisor == 0)	{
			System.out.println(divisor + " ");
			printPrimeFactors(num/divisor, divisor);
		} else {
			printPrimeFactors(num, divisor +1);
		}
	}
}