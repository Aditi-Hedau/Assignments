public class Recursion2
{
	static int show(int n)
	{
		if(n == 4)
			return n;
		else
			return 2*show(n+1);
	}
	public static void main(String[] args)
	{
		System.out.println(show(2));
	}
}



//show(2)
//2*[show(2+1)]
//2*[2*show(3+1)]
//2*2*[4]
//16


//HW:-
//2+
//show(21)
//diagram draw