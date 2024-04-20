class isort{
	 void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i =1; i<n; i++){
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	
	void display(int arr[])	{
			int n = arr.length;
			for(int i = 0; i<n ; i++){
				System.out.print(arr[i] + " ");
			}
	}

	public static void main(String[] args){
		isort h1 = new isort();
		int arr[] = {11,55,33,88,44,22};
		System.out.print("Original array : ");
		h1.display(arr);

		System.out.println();

		h1.insertionSort(arr);

		System.out.print("Sorted array : ");
		h1.display(arr);	
	}

}