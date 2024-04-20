public class P3{
	public static double findMean(int A[], int N){
		if(N == 1){
			return (double)A[N-1];
		} else {
			return ((double)(findMean(A, N-1)*(N-1) + A[N-1]) / N);
		}
	}

	public static void main(String[] args){
		double Mean = 0;
		int A[] = {1, 2, 3, 4, 5};
		int N = A.length;
		System.out.println(findMean(A, N));	
	}
}