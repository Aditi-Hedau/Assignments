package in.cdac.acts;

public class Program {
	public static void checkOrder(int[] arr) {
		boolean ascending = true;
		boolean descending = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				descending = false;
			} else if (arr[i] > arr[i + 1]) {
				ascending = false;
			}
		}

		if (ascending) {
			System.out.println("Ascending");
		} else if (descending) {
			System.out.println("Descending");
		} else {
			System.out.println("Random");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 5, 14, 35, 90, 139 };
		int[] arr2 = { 88, 67, 35, 14, -12 };
		int[] arr3 = { 65, 14, 129, 34, 7 };

		System.out.print("Input: ");
		printArray(arr1);
		System.out.print("Output: ");
		checkOrder(arr1);

		System.out.print("Input: ");
		printArray(arr2);
		System.out.print("Output: ");
		checkOrder(arr2);

		System.out.print("Input: ");
		printArray(arr3);
		System.out.print("Output: ");
		checkOrder(arr3);
	}

	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

	}
}
