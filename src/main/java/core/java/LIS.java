package core.java;

import java.util.Scanner;

public class LIS {

	public static void LIS2() {
		Scanner scanner = new Scanner(System.in);
		int N= scanner.nextInt();
		int[] arr = new int[N];
		int[] LIS = new int[N + 1];
		LIS[1] = 0;
		int max = 1;
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
			if (arr[LIS[max]] < arr[i]) {
				max++;
				LIS[max] = i;
				continue;
			}
			int lo = 1;
			int hi = max;
			int mid;
			while (lo < hi) {
				mid = (lo + hi) / 2;
				if (arr[LIS[mid]] >= arr[i])
					hi = mid;
				else
					lo = mid + 1;

			}
			if (arr[LIS[lo]] > arr[i])
				LIS[lo] = i;
		}
		System.out.println(max);
		scanner.close();
	}

	private static int printLis(int[] arr) {
		int n = arr.length;
		int[] lis = new int[n];
		for (int i = 0; i < n; i++) {
			lis[i] = 1;
		}
		int max = 1;
		for (int i = 1; i < n; i++) {

			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i])
					lis[i] = Math.max(lis[i], 1 + lis[j]);
				if (lis[i] > max)
					max = lis[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// code
		Scanner scanner = new Scanner(System.in);
		int numTests = Integer.valueOf(scanner.nextLine());
		for (int i = 0; i < numTests; i++) {
			int numElements = Integer.valueOf(scanner.nextLine());
			String[] strNums = scanner.nextLine().split(" ");
			scanner.close();
			int[] arr = new int[numElements];
			for (int j = 0; j < numElements; j++) {
				arr[j] = Integer.valueOf(strNums[j]);
			}
			System.out.println(printLis(arr));
		}
	}
}