package hackerearth;

import java.util.Scanner;

public class StringToAscii {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine().trim();
		char last = string.substring(string.length() - 1).charAt(0);
		if (!((last - 96) % 2 == 0))
			System.out.println("NO");
		else {
			long sum = 0;
			for (char st : string.toCharArray())
				sum = (sum + (int) st - 96) % 3;
			System.out.println(sum % 3 == 0 ? "YES" : "NO");
		}

	}

}
