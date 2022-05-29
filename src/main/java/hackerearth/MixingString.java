package hackerearth;

import java.util.Scanner;

public class MixingString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		s.nextLine();
		String[] arr = new String[N];
		StringBuilder finalArr = new StringBuilder("");
		StringBuilder temp = new StringBuilder("");
		for (int i = 0; i < N; i++) {

			arr[i] = s.nextLine().trim();
			/* System.out.println(" new item : "+arr[i]); */
			if (i == 0) {

				finalArr.append(arr[i]);
				continue;
			}

			int j = 0;
			for (j = arr[i].length() - 1; j >= 0; j--) {
				/*
				 * System.out.println(" j : "+j);
				 * System.out.println("sub string comparison : "+arr[i].substring(0, j+1));
				 */
				if (finalArr.toString().endsWith(arr[i].substring(0, j + 1))) {
					/*
					 * System.out.println("appending string : "+arr[i].substring(j+1));
					 */finalArr.append(arr[i].substring(j + 1));
					break;
				}
			}
			if (j == -1)
				finalArr.append(arr[i]);
		}

		System.out.println(finalArr.toString().length());

	}

}
