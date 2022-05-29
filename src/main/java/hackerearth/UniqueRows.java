package hackerearth;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
		HashSet<String> set = new HashSet<>();
		boolean flag;
		for (int i = 0; i < T; i++) {
			flag = false;
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			scanner.nextLine();
			set.clear();
			for (int k = 0; k < N && flag == false; k++) {
				if (!set.add(scanner.next()))
					flag = true;
			}
			System.out.println((flag) ? "No" : "Yes");
			Integer k = Integer.valueOf(45);
		}
		scanner.close();
	}

}
