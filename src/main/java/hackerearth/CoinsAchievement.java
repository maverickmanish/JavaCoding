package hackerearth;

import java.util.Scanner;

public class CoinsAchievement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			sc.nextLine();
			long N = sc.nextLong();
			long M = sc.nextLong();
			long A = sc.nextLong();
			long B = sc.nextLong();
			long C = sc.nextLong();
			long sum = 0;
			if (C >= A && C >= B) {
				if (N <= M) {
					sum = 2 * N * C + (M - N) * B;
				} else {
					sum = 2 * M * C + (N - M) * A;
				}
			}
			else if ((A >= C && B >= C) || (A + B >= 2 * C))
				sum = N * A + M * B;
			else if (A > B) {
				if (N <= M) {
					sum = 2 * N * C + (M - N) * B;
				} else {
					sum = 2 * M * C + (N - M) * A;
				}

			} else if (A < B) {

				if (M <= N) {
					sum = 2 * M * C + (N - M) * A;
				} else {
					sum = 2 * N * C + (M - N) * B;
				}
			}
			System.out.println(sum);
		}
	}
}
