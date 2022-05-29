package hackerearth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < T; i++) {
			list.add(scanner.nextLine().trim());
		}

		for (String string : list) {

			if (list.contains(new StringBuilder(string).reverse().toString())) {
				System.out.println(string.length() + " " + middleCharacter(string));
				break;
			}
		}
	}

	public static char middleCharacter(String s) {
		return s.toCharArray()[s.length() / 2];
	}

}
