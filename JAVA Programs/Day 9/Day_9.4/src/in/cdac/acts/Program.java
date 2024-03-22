package in.cdac.acts;

public class Program {

	public static void main(String[] args) {
		int[] array = new int[] { 10, 20, 30, 40, 50, 60 };

		System.out.println("Original Array Element : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}

		System.out.println();

		System.out.println("Reversed Array :  ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + "  ");
		}

	}
}
