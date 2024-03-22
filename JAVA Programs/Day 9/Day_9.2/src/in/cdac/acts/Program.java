package in.cdac.acts;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		int[] a1 = new int[] {10,20,30};
		int[] a2 = new int[] {10,20,30};

		if (Arrays.equals(a1, a2)) {

			System.out.println("Same");
		} else {

			System.out.println("Not same");
		}
	}

}
