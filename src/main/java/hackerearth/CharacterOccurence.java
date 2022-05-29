package hackerearth;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CharacterOccurence {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
	
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < T; i++) {
			int S = scanner.nextInt();
			scanner.nextLine();
			set.clear();
			boolean flag = false;
			for (int j = 0; j < S; j++) {
				Character city = scanner.nextLine().trim().charAt(0);
				if (!flag && set.contains(city)) {
					flag = true;
				} else if(!flag)
					set.add(city);
				
			}

			if (flag)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}

}
