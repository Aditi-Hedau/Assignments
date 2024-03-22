import java.util.Scanner;
class Eighteenth
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.print("Enter your choice (1/2/3/4):  ");
		int i = sc.nextInt();

		System.out.print("Enter first number : ");
		int n1 =sc.nextInt();
		System.out.print("Enter second number : ");
		int n2=sc.nextInt();

		int result=0;

		switch(i)
		{
			case 1:	result = n1+n2;
				System.out.println("Result: " +result);
				break;

			case 2: result = n1-n2;
				System.out.println("Result: " +result);
				break;

			case 3: result = n1*n2;
				System.out.println("Result: " +result);
				break;

			case 4: result = n1/n2;
				System.out.println("Result: " +result);
				break;
			
			default: System.out.println("Invalid input!!!");
		}
	}
}