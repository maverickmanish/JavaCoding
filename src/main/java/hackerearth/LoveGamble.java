package hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LoveGamble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		ArrayList<Integer> A = (ArrayList<Integer>) Stream.of(scanner.nextLine().trim().split(" "))
				.map(Integer::parseInt).collect(Collectors.toList());
		Collections.sort(A, Collections.reverseOrder());

		long total = streamToLongSum(A);
		if (total % 2 != 0)
			System.out.println(total);
		else {
			int i = A.size();
			while (i-- > 0) {
				if (A.get(i) % 2 != 0) {
					A.remove(i);
					System.out.println((long) A.stream().mapToInt(Integer::intValue).sum());
					break;
				}
				if (i == 0)
					System.out.println(":(");

			}
		}
	}

	public static long streamToLongSum(ArrayList<Integer> A) {
		return (long) A.stream().mapToInt(Integer::intValue).sum();
	}
}
