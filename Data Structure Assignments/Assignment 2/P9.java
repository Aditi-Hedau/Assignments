public class P9{
	public static int sum(int[] array, int size, int sum){
		if(size == 0){
			return sum;
		} else {
			return sum(array, size - 1, sum + array[size - 1]);
		}
	}

	public static void main(String[] args){
		int[] array = {1,3,5,7};
		int size = array.length;
		System.out.println(sum(array, size, 0));
	}
}