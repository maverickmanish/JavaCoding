package hackerearth;

import java.math.BigInteger;
import java.util.Scanner;

public class XorMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < T; i++) {

			BigInteger b1 = new BigInteger(scanner.nextLine());
			if (b1.equals(new BigInteger("1")))
				System.out.println("0 1");
			else {
				System.out.print(b1.subtract(new BigInteger("1")).xor(b1.subtract(new BigInteger("2"))));
				System.out.println(" " + 2);
			}

		}
	}

}
