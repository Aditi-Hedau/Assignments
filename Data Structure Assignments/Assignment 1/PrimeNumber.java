
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		sc.close();
		if(isPrime(num))
			System.out.println("is Prime Number");
		else
			System.out.println("is not Prime Number");
	}

	public static boolean isPrime(int num) {
		if(num <= 1)
			return false;
		else
			return isPrime(num, 2);
	}

	public static boolean isPrime(int num, int divisor) {
		if(divisor * divisor > num)
			return true;
		if(num % divisor == 0)
			return false;
		return isPrime(num, divisor + 1);
	}
}