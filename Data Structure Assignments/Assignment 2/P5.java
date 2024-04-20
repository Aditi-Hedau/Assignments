public class P5{
	public static int find(int N){
		if(N == 0){
			return 0;
		} else {
			return(N % 2 + 10 * find(N/2));
		}
	}

	public static void main(String[] args){
		int N = 10;
		System.out.println(find(N));
	}
}