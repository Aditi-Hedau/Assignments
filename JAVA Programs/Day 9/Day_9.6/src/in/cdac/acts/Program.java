package in.cdac.acts;

public class Program {

	public static void main(String[] args) {
		int[] array = new int[] { 24,54,31,16,82,45,67 };

		int firstLargest = 0;
		int secondLargest = 0;
		int thirdLargest = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest=array[i];
				} else if(array[i] >secondLargest) {
					thirdLargest = secondLargest;
					secondLargest = array[i];
				} else if(array[i] > thirdLargest) {
					thirdLargest = array[i];
				}

		}
		System.out.println("1St Largest : " +firstLargest);
		System.out.println("2nd Largest : " +secondLargest);
		System.out.println("3rd Largest : " +thirdLargest);
	}
}
