import java.util.Scanner;

public class SumOfMatrixRows {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		int i, j, rows, columns, sum = 0;
		
		sc= new Scanner(System.in);
		
		System.out.println("\n Enter Matrix Rows and Columns :  ");
		rows = sc.nextInt();
		columns = sc.nextInt();
		
		int[][] SumOfRows_arr = new int[rows][columns];
		
		System.out.println("\n Please Enter the Matrix Items :  ");
		for(i = 0; i < rows; i++) {
			for(j = 0; j < columns; j++) {
				SumOfRows_arr[i][j] = sc.nextInt();
			}		
		}	
		
		for(i = 0; i < SumOfRows_arr.length; i++)
		{
			sum = 0;
			for(j = 0; j < SumOfRows_arr[i].length; j++)
			{
				sum = sum + SumOfRows_arr[i][j];
			}
			System.out.println("\nThe Sum of Matrix Items in  " + i + " row = " + sum);
		}
	}
} 
 

/*class SumOfMatrixRows {

	// Get the size m and n
	static int m = 4;
	static int n = 4;

	// Function to calculate sum of each row
	static void row_sum(int arr[][])
	{

		int i, j, sum = 0;

		System.out.print("\nFinding Sum of each row:\n\n");

		// finding the row sum
		for (i = 0; i < m; ++i) {
			for (j = 0; j < n; ++j) {

				// Add the element
				sum = sum + arr[i][j];
			}

			// Print the row sum
			System.out.println("Sum of the row " + i + " = "
							+ sum);

			// Reset the sum
			sum = 0;
		}
	}

	// Function to calculate sum of each column
	static void column_sum(int arr[][])
	{

		int i, j, sum = 0;

		System.out.print(
			"\nFinding Sum of each column:\n\n");

		// finding the column sum
		for (i = 0; i < m; ++i) {
			for (j = 0; j < n; ++j) {

				// Add the element
				sum = sum + arr[j][i];
			}

			// Print the column sum
			System.out.println("Sum of the column " + i
							+ " = " + sum);

			// Reset the sum
			sum = 0;
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		int i, j;
		int[][] arr = new int[m][n];

		// Get the matrix elements
		int x = 1;
		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++)
				arr[i][j] = x++;

		// Get each row sum
		row_sum(arr);

		// Get each column sum
		column_sum(arr);
	}
}*/
// This code is contributed by inder_verma..
