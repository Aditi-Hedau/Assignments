import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		sc.close();
		if(isPerfect(num))
			System.out.println("is Perfect Number");
		else
			System.out.println("is not Perfect Number");
	}

	public static boolean isPerfect(int num) {
        	if (num <= 1)
            		return false;
        	int sum = 1;
        	for (int i = 2; i * i <= num; i++) {
            		if (num % i == 0) {
                		sum += i;
                	if (i * i != num)
                    		sum += num / i;
            		}
        	}
        	return sum == num;
    }
}