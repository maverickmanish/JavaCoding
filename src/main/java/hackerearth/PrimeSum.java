package hackerearth;

import java.util.Scanner;

public class PrimeSum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for (int k = 0; k < T; k++) {
			long number = scanner.nextLong();

			boolean flag = false;
			for (int i = 2; i <= number / 2; ++i) {
				// condition for i to be a prime number
				if (checkPrime(i)) {
					// condition for n-i to be a prime number
					if (checkPrime(number - i)) {
						// n = primeNumber1 + primeNumber2

						flag = true;
					}
				}
			}
			if (!flag)
				System.out.println("Arjit");
			else
				System.out.println("Arjit");

		}
	}

	// Function to check prime number
	static boolean checkPrime(long l) {
		boolean isPrime = true;
		for (int i = 2; i <= l / 2; ++i) {
			if (l % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}