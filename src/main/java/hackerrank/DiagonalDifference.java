package hackerrank;


import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[][] arr = new int[n][n];

	        for (int i = 0; i < n; i++) {
	            String[] arrRowItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int j = 0; j < n; j++) {
	                int arrItem = Integer.parseInt(arrRowItems[j]);
	                arr[i][j] = arrItem;
	            }
	        }

	        int result = diagonalDifference(arr);
	        System.out.println("finally, the difference is : "+result);
	        
	        

	}

	private static int diagonalDifference(int[][] arr) {
		   int d1 = 0, d2 = 0, n=arr.length; 
		  
	        for (int i = 0; i < n; i++) 
	        { 
	            for (int j = 0; j < n; j++) 
	            { 
	            	
	            	if(i == j && i == n - j - 1)
	            	{
	            		
	            	}
	            	else if(i == j)   // finding sum of primary diagonal 
	                    d1 += arr[i][j]; 
	            	else if (i == n - j - 1) // finding sum of secondary  diagonal 
	                    d2 += arr[i][j]; 
	            } 
	        } 
	       
	        // Absolute difference of the sums 
	        // across the diagonals 
	        return Math.abs(d1 - d2); 
	}

}
