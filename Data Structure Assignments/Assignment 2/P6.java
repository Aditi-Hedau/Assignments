public class P6{
	public static int sum(int N){
		if(N==0){
			return 0;
		} else {
			return (N%10 + sum(N/10));
		}
	}

	public static void main(String[] args){
		int N = 12345;
		int result = sum(N);
		System.out.println("Sum of digits in " +N+ " is " + result);
	}
}