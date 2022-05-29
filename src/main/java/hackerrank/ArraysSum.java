package hackerrank;

import java.util.Scanner;

public class ArraysSum {
	
	public static void main(String[] args) {
		 final Scanner scanner = new Scanner(System.in);

	     int arCount = Integer.parseInt(scanner.nextLine().trim());
		 int[] ar = new int[arCount];

	     String[] arItems = scanner.nextLine().split(" ");

	     for (int arItr = 0; arItr < arCount; arItr++) {
	         int arItem = Integer.parseInt(arItems[arItr].trim());
	         ar[arItr] = arItem;
	     }
	     
	    
	     int result = simpleArraySum(ar );
	     scanner.close();
	     System.out.println("sum is "+result);
	}

	private static int simpleArraySum(int[] ar) {
		int sum=0;
		for (int i : ar) {
			sum+=i;
		}
		return sum;
	}
}
