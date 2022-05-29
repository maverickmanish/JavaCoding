package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {

		System.out.println(Integer.MAX_VALUE);
		Integer[] arr = new Integer[5];
		Scanner scanner = new Scanner(System.in);
		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}
		miniMaxSum(arr);
		scanner.close();
	}

	private static void miniMaxSum(Integer[] arr) {
		int max = Collections.max(Arrays.asList(arr));
		int min = Collections.min(Arrays.asList(arr));
		long sum = 0;
		for (int i : arr)
			sum += i;
		long lowest = (long) (sum - max), highest = (long) (sum - min);
		System.out.printf("%d %d", lowest, highest);

	}
}
