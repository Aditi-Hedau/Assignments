import java.util.Scanner;

public class RamanujamNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if (isRamanujam(num))
            System.out.println(num + " is a Ramanujam number.");
        else
            System.out.println(num + " is not a Ramanujam number.");
    }

    public static boolean isRamanujam(int n) {
        int count = 0;
        for (int a = 1; a <= Math.cbrt(n); a++) {
            for (int b = a + 1; b <= Math.cbrt(n); b++) {
                int sum = (int) (Math.pow(a, 3) + Math.pow(b, 3));
                if (sum == n)
                    count++;
                if (count == 2)
                    return true;
            }
        }
        return false;
    }
}
