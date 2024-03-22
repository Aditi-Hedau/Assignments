import java.util.Scanner;
public class Que3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter num2 : " );
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result=0;
        switch(operator)
        {
            case '+':
                result = num1 + num2;
                break;           
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        System.out.println("Result: " + result);


    }
}
