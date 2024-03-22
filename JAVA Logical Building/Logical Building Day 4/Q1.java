class Q1
{
	public static void main(String[] args)
	{
		int arr[]={5,4,3,9,1,7,9};
		
		int sum = 0;
		for(int n : arr)
		{
			sum+=n;
		}

		double average = (double) sum/ arr.length;

		System.out.println("Average value : " + average);
		
	}
}