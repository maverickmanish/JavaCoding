package hackerearth;

import java.util.Scanner;
import java.util.stream.Stream;

public class PrimitivePythogorianTriplet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < T; i++) {
			Integer[] triplet = Stream.of(scanner.nextLine().trim().split(" ")).map(Integer::parseInt)
					.toArray(Integer[]::new);
			if (coprime(triplet[0], triplet[1]) && coprime(triplet[0], triplet[2]) && coprime(triplet[2], triplet[1]))
				System.out.println(pythagorian(triplet[0], triplet[1], triplet[2]));
			else
				System.out.println("NO");
		}
	}

	public static String pythagorian(int a, int b, int c) {
		if (a > b && a > c)
			return a * a == b * b + c * c ? "YES" : "NO";
		else if (b > a && b > c)
			return b * b == a * a + c * c ? "YES" : "NO";
		else if (c > b && c > a)
			return c * c == b * b + a * a ? "YES" : "NO";
		else
			return "NO";
	}

	static long __gcd(int a, int b) {
		// Everything divides 0
		if (a == 0)
			return b;

		// base case
		if (a == b)
			return a;

		// a is greater
		if (a > b)
			return __gcd(a - b, b);

		return __gcd(a, b - a);
	}

	static boolean coprime(int a, int b) {
		return (__gcd(a, b) == 1) ? true : false;
	}

}
