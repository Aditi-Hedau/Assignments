import java.util.Scanner;
class Q4
{
	public static void main(String[] args)
	{
		int matrix1[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int matrix2[][] = {{9,8,7}, {6,5,4}, {3,2,1}};

		if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length)
		{
			System.out.println("Matrixs must have same rows and columns");
		}

		int result[][]= new int[matrix1.length][matrix2[0].length];

		for(int i=0; i < matrix1.length; i++)
		{
			for(int j=0; j < matrix2.length; j++)
			{
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		
		}
		System.out.println("Sum of Matrix are: ");
		printMatrix(result);	
	}

	public static void printMatrix(int[][] matrix) 
	{
        	for (int i = 0; i < matrix.length; i++) 
		{
            		for (int j = 0; j < matrix[0].length; j++)
			{
                		System.out.print(matrix[i][j] + " ");
            		}
            	System.out.println();
        	}
    	}

}