package hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GiftParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < T; i++) {
			int N = scanner.nextInt();
			Long X = scanner.nextLong();
			List<Integer> array = new ArrayList<>();
			long total = 0;
			for (int k = 0; k < N; k++) {
				array.add(scanner.nextInt());
				if (total != X)
					total += array.get(k);
			}
			if (total == X)
				System.out.println("YES");
			else {
				long difference = total - X;
				Collections.sort(array);
				if (array.contains(difference))
					System.out.println("YES");
				else {
					int index = array.indexOf(difference);
					total = array.stream().filter(j -> array.indexOf(j) < index).mapToLong(Long::new).sum();
					if (array.contains(total - difference))
						System.out.println();
				}

			}

		}

	}

}
