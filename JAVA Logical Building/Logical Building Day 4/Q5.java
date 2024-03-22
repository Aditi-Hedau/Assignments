class Q5
{
	public static void main(String[] args) 
	{
  	     int A[][] = {{7, 9, 2}, {3, 8, 6}, {1, 4, 2}};
  	     int B[][] = {{7, 9, 2}, {3, 8, 6}, {1, 4, 2}};
	       int flag = 1;	
		 int n = 3;	
	    for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (A[i][j] != B[i][j])
                    flag = 0;
        if (flag == 1)
            System.out.println("Both the matrices are identical");
        else
            System.out.println("Both the matrices are not identical");
    }
}