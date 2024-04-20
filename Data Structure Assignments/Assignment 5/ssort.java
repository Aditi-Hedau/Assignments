class ssort{
	void selectionSort(int arr[]){
		int n = arr.length;
		for(int i = 0 ; i<n-1; i++){
			int min = i;
			for(int j = i+1; j<n; j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			if(min!= i){
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
	void display(int arr[])	{
			int n = arr.length;
			for(int i = 0; i<n ; i++){
				System.out.print(arr[i] + " ");
			}
	}

	public static void main(String[] args){
		ssort h1 = new ssort();
		int arr[] = {11,55,33,88,44,22};
		System.out.print("Original array : ");
		h1.display(arr);

		System.out.println();

		h1.selectionSort(arr);

		System.out.print("Sorted array : ");
		h1.display(arr);	
	}

}