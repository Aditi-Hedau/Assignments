class Q2
{
	public static void main(String[] args)
	{
		int arr[] = {5,4,3,9,1,7,9};
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]< min)
			{	
				min=arr[i];
				
			}
			if(arr[i]>max)
			{
				max=arr[i];
					
			}
		}
		
		System.out.println("Minimum Value : " +min);	
		System.out.println("Maximum Value : " +max);
	}
}
