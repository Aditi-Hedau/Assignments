package in.cdac.acts;

public class Program {
	private static void printSumOfPairs(int array[], int n, int sum) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i] + array[j] == sum) {
					System.out.println("(" + array[i] + " , " + array[j] + ")");
				}

			}
		}
	}

	public static void main(String[] args) {
		int[] array = {1,2,4,6,8};
		int n = array.length;
        int sum = 10;
        printSumOfPairs(array, n, sum);

	}
}
