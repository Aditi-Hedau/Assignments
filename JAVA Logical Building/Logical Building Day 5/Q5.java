class Q5
{
	public static void main(String[] args)
	{
		int arr[] = {5,3,9,7,1};
		int n = arr.length;

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for(int i=0; i<n; i++)
		{
			if(arr[i] > highest)
			{
				secondHighest = highest;
				highest = arr[i];
			}
			if(arr[i]<highest && arr[i]>secondHighest)
			{
				secondHighest = arr[i];
			}
		}
		System.out.println("Second Highest " + secondHighest);
	}
}