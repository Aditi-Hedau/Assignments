public class Recursion
{
	static void show()
	{
		System.out.println("Hello Girls !!");
		show();		//function call for infinite loop
	}
	public static void main(String[] args)
	{
		show();
	}
}