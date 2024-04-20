public class P4{
	public static int findSum(int A[], int N){
		if(N <= 0){
			return 0;
		} else {
			return (findSum(A, N-1)+ A[N-1]);
		}
	}

	public static void main(String[] args){
		int Sum = 0;
		int A[] = {1, 2, 3, 4, 5};
		System.out.println(findSum(A, A.length));	
	}
}