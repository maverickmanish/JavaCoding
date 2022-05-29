
package hackerearth;

import java.util.Scanner;

public class CounterToAshu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		long N = s.nextLong();
		long aray[] = new long[(int) N];
		s.nextLine();
		for (long i = 0; i < N; i++) {
			aray[(int) i] = s.nextLong();

		}
		s.nextLine();
		int Q = s.nextInt();
		for (int i = 0; i < Q; i++) {
			s.nextLine();
			long array[] = new long[3];
			array[0] = s.nextLong();
			array[1] = s.nextLong();
			array[2] = s.nextLong();
			function(array, aray);

		}
	}

	private static void function(long[] array, long[] aray) {
		if (array[0] == 0)
			aray[(int) (array[1] - 1)] = array[2];
		else if (array[0] == 1) {
			long count = 0;
			for (int i = (int) (array[1] - 1); i < array[2]; i++)
				if (aray[i] % 2 == 0)
					count++;
			System.out.println(count);
			System.out.println();
		} else {
			long count = 0;
			for (int i = (int) (array[1] - 1); i < array[2]; i++)
				if (aray[i] % 2 != 0)
					count++;
			System.out.println(count);
		}

	}

}
