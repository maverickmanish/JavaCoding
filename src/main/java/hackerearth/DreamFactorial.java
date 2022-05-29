package hackerearth;

import java.util.Scanner;
import java.util.stream.Stream;

public class DreamFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < T; i++) {
			Long[] inputs = Stream.of(sc.nextLine().trim().split(" ")).map(Long::parseLong).toArray(Long[]::new);
			System.out.printf("%.0f", (factorial(factorial(inputs[0])) % Math.pow(10, inputs[1])));
		}

	}

	public static  long factorial(long input) {
		if (input == 1 || input == 0)
			return 1;
		else
			return input * factorial(input - 1);

	}

}
