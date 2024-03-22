package in.cdac.acts;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		int[] array1 = new int[] {23, 60, 94, 3, 103};
		int[] array2 = new int[] {42, 16, 74};
		
		int a1 = array1.length;
		int b1 = array2.length;
		int c1 = a1 + b1;
		
		int[] sum = new int[c1];

		System.arraycopy(array1, 0, sum, 0, a1); 
        System.arraycopy(array2, 0, sum, a1, b1); 
        
		System.out.println(Arrays.toString(sum));
	}
}
