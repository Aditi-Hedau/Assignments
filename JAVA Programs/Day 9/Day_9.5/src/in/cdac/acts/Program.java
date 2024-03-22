package in.cdac.acts;

public class Program {

	public static void main(String[] args) {
		int[] array = new int[] { 10, 2, 6, 4, 9, 5 };

		int largest = array[0];
		int smallest = array[0];

		for (int i = 0; i < array.length; i++) {
			if (smallest > array[i]) {
				smallest = array[i];

			}
			if (largest < array[i]) {
				largest = array[i];

			}
		}
		System.out.println("Smallest : " + smallest);
		System.out.println("Largest : " + largest);

	}
}
