public class Recursion3
{
	static int fact(int n)
	{
		if(n <= 1)
			return 1;
		else
			return n*fact(n-1);	//Tail recursion
	}
	public static void main(String[] args)
	{
		System.out.println(fact(3));
	}
}


//1st method:
//fact(3)
//	3*[fact(2)]
//		3*[2*fact(1)]
//			3*2*[1] = 6
//				fact(3)=6

//2nd method: RECURSION TREE(Tail recursion)
// n*fact(n-1)
//fact(3) = 6
//	3	fact(2)
//		2	fact(1)
//			1	1

//3rd method: RECURSION TREE(Head recursion)
// fact(n-1)*n
// fact(3)
//fact(2)	3
//fact(2)	2
//fact(1)
//1