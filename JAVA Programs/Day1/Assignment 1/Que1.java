import java.util.Scanner;
public class Que1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerical grade : ");
        int grade = scanner.nextInt();

        if(grade>=90)
        {
            System.out.println("Grade A");
        }
        else if(grade>=80){
            System.out.println("Grade B");
        }else if(grade>=70){
            System.out.println("Grade C");
        }else if(grade>=60){
            System.out.println("Grade D");
        }else{
            System.out.println("F");
        }
    
        System.out.println("Final Grades are : " +grade);
    }
}
