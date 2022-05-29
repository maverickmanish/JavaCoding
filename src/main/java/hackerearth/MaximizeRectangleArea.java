package hackerearth;

import java.util.Scanner;

public class MaximizeRectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for (int i = 0; i < T; i++) {
			scanner.nextLine();
			long n = scanner.nextLong();
			if (n % 2 != 0)
				n--;
			n /= 2;
			if (n % 2 != 0) {
				n /= 2;
				System.out.println(n * (n + 1));
			} else
				System.out.printf("%.0f\n", Math.pow(n / 2, 2));
		}
	}

}
