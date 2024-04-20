
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		sc.close();
		if(isArmstrong(num))
			System.out.println("is Armstrong Number");
		else
			System.out.println("is not Armstrong Number");
	}

	public static boolean isArmstrong(int num) {
	int originalNum = num;
        int sum = 0;
        int numOfDigits = countDigits(num);
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numOfDigits);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}