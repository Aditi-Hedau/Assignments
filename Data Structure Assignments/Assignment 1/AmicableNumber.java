import java.util.Scanner;

public class AmicableNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        if (areAmicable(num1, num2))
            System.out.println(num1 + " and " + num2 + " are amicable numbers.");
        else
            System.out.println(num1 + " and " + num2 + " are not amicable numbers.");
    }

    public static boolean areAmicable(int num1, int num2) {
        return (sumOfDivisors(num1) == num2) && (sumOfDivisors(num2) == num1);
    }

    public static int sumOfDivisors(int n) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i)
                    sum += n / i;
            }
        }
        return sum;
    }
}
