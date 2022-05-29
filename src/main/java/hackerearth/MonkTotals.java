package hackerearth;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MonkTotals {
	public static void main(String args[]) throws Exception {
		// Scanner
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int M = s.nextInt();

		s.nextLine();

		long array[][] = new long[N][M];

		long rowTotals = 0;
		long colTotals = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				array[i][j] = s.nextLong();

			}
			s.nextLine();
		}
		long operations[] = new long[4];

		for (int o = 0; o < 4; o++) {

			operations[o] = s.nextLong();
		}

		for (int i = 0; i < N; i++) {
			long noChange = 0;
			long rTotals = 0;
			for (int j = 0; j < M; j++) {
				noChange += Math.abs(array[i][j]);
				rTotals += Math.abs(array[i][j] + operations[0]);
			}
			rowTotals += Math.max(Math.max(noChange, rTotals), Math.abs(operations[1]) * M);
			//System.out.println(rowTotals);
		}

		for (int i = 0; i < M; i++) {
			long noChange = 0;
			long cTotals = 0;
			for (int j = 0; j < N; j++) {
				noChange += Math.abs(array[j][i]);
				cTotals += Math.abs(array[j][i] + operations[2]);
			}
			colTotals += Math.max(Math.max(noChange, cTotals), Math.abs(operations[3]) * N);
			//System.out.println(colTotals);
		}

		System.out.println(Math.max(rowTotals, colTotals));

	}

}