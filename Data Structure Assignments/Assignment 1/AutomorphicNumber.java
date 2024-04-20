import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if (isAutomorphic(num))
            System.out.println(num + " is an Automorphic number.");
        else
            System.out.println(num + " is not an Automorphic number.");
    }

    public static boolean isAutomorphic(int n) {
        int square = n * n;
        while (n > 0) {
            if (n % 10 != square % 10)
                return false;
            n /= 10;
            square /= 10;
        }
        return true;
    }
}
