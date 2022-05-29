package hackerearth;

import java.util.Scanner;

public class MonkBosky {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		long array[] = new long[N];
		s.nextLine();
		for (int i = 0; i < N; i++) {
			array[i] = s.nextLong();
		}

		for (int i = 0; i < N; i++) {
			int counter = 0;
			int arrayIndex[] = new int[i + 1];
			for (int j = i - 1; j >= 0; j--) {

				if (array[j] >= array[i]) {
					counter++;
					arrayIndex[j] = j;
				}
			}

			for (int k = 0; k < counter; k++) {
				array[arrayIndex[k]]++;
			}
		}

		for (long l : array) {
			System.out.print(l);
		}

	}
}
