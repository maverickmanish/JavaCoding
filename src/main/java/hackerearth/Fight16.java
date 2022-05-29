package hackerearth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fight16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < T; i++) {
			int R = scanner.nextInt();
			int S = scanner.nextInt();
			int N = scanner.nextInt();
			scanner.nextLine();
			ArrayList<Long> A = (ArrayList<Long>) Stream.of(scanner.nextLine().trim().split(" ")).map(Long::parseLong)
					.collect(Collectors.toList());
			Collections.sort(A);
			if (R == S)
				System.out.println("Tie");
			else {
				System.out.println(dishCounter(R, A) >= dishCounter(S, A)
						? ((dishCounter(R, A) == dishCounter(S, A)) ? "Tie" : "Raghu Won")
						: "Sayan Won");
			}
		}
	}

	public static int dishCounter(int Kcal, ArrayList<Long> A) {
		int counter = 0;
		long sum = 0;
		for (Long long1 : A) {
			sum += long1;
			if (sum <= Kcal)
				counter++;
			else
				break;
		}

		return counter;

	}

}
