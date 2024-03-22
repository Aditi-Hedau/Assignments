package in.cdac.acts;

public class Program {

	public static void printAverage(int[] arr) {
		if (arr.length < 3) {
			System.out.println("array has fewer than 3 integers, there should be no output");
			return;
		}
		
		System.out.print(" [ ");
		
		for(int i=0; i<=arr.length-3; i++) {
			int sum = arr[i] + arr[i + 1] + arr[i + 2];
			int average = sum/3;
			System.out.print(average);
			if(i<arr.length-3) {
				System.out.print(" , ");
			}
		}
		System.out.print(" ] ");

	}

	public static void main(String[] args) {
		int[] arr = new int[] {5, 14, 35, 89, 140};
		printAverage(arr);

	}
}
