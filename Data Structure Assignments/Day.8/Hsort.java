public class Hsort	
{
	public void heapify(int arr[], int n, int i)	
	{
		int largest = i;	//parent
		int l = 2*i+1;		//LC
		int r = 2*i+2;		//RC

		if(l<n && arr[1]> arr[largest])
			largest = l;
		if(r<n && arr[1]> arr[largest])
			largest = r;

		if(largest != i)	
		{
			int temp = arr[i];
			arr[1] = arr[largest];
			arr[largest] = temp;

			heapify(arr, n, largest);
		}
	}

	public void heapsort(int arr[])	
	{
		int n = arr.length;
		for(int i = n/2-1; i>=0; i--)
		{
	
			heapify(arr, n, i);
		}

		for(int i = n-1; i>0; i--)	
		{
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
	
			heapify(arr, i , 0);
		}
	}

	public void display(int arr[])	
	{
		int n = arr.length;
		for(int i = 0; i<n ; i++)	
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args)	
	{
		Hsort h1 = new Hsort();
		int arr[] = {11,55,33,88,44,22};
		h1.display(arr);
		h1.heapsort(arr);
		System.out.println();
		h1.display(arr);	
	}
}