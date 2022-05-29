package hackerearth;

import java.util.Scanner;

public class copyingFiles {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for (int i = 0; i < T; i++) {
			s.nextLine();
			long N = s.nextLong();
			long M = s.nextLong();
			int timer = 1, counter = 1;
			long temp = ((M * (M + 1)) / 2);
			counter += M;
			timer += temp;
			while (N > timer) {
				if (N >= timer + M) {
					timer += M;
					counter++;
				} else {
					counter++;
					break;
				}
			}
			System.out.println(counter);
		}
		s.close();
	}
}
