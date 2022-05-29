package hackerearth;

import java.util.Scanner;
import java.util.stream.Stream;

public class CountOfPosibleWays {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < T; i++) {

			Object a[] = Stream.of(scanner.nextLine().trim().split(" ")).map(Long::parseLong).toArray();

			long total_matches = (long) a[0];
			long total_points = (long) a[1];

			long x = (total_points / 5);
			long y = (total_points % 5);
			if (x + y > total_matches)
				System.out.println(0);
			else
				System.out.println(((total_matches - x - y) / 4) + 1);

		}
		scanner.close();
	}

}
