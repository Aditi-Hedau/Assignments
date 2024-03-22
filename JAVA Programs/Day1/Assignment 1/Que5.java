import java.util.Scanner;
public class Que5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Character : ");
        int ch = scanner.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
          || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("Its a Vowel");
        }
        else
        {
            System.out.println("Its Not a Vowel");
        }
        
    }    
}
