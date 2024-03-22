import java.util.Scanner;
public class Que2
{
    public static void main(String[] args) 
    {
        
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter year : ");
        int n = scanner.nextInt();
        if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
        {
            System.out.println("Leaps Year");
        } 
        else 
        {
        System.out.println("Not a Leap Year");
        }
    }
    
}
