import java.util.Scanner;

public class Palindrome	{
	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		sc.close();
		if(isPalindrome(num))
			System.out.println("is Palindrome");
		else
			System.out.println("is not Palindrome");
	}

	public static boolean isPalindrome(int num) {
		int reversedNum = reverse(num);
		return num == reversedNum;
	}

	public static int reverse(int num) {
		int reversedNum = 0;
		while(num != 0) {
			int digit = num % 10;
			reversedNum = reversedNum * 10 + digit;
			num /= 10;
		}
		return reversedNum;
	}
}