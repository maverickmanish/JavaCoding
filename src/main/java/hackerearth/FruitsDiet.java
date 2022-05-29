package hackerearth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class FruitsDiet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer[] desiredDiet = Stream.of(scanner.nextLine().trim().split(" ")).map(Integer::parseInt)
				.toArray(Integer[]::new);
		int T = scanner.nextInt();
		scanner.nextLine();
		// List<Integer[]> list = new ArrayList<>();
		int counter = 0;
		for (int i = 0; i < T; i++) {
			/*
			 * if (counter > 0) break;
			 */
			Integer[] array = Stream.of(scanner.nextLine().trim().split(" ")).map(Integer::parseInt)
					.toArray(Integer[]::new);
			// list.add(array);
			if ((counter == 0) && (desiredDiet[0] - array[0]) >= 0 && (desiredDiet[1] - array[1]) >= 0
					&& (desiredDiet[2] - array[2]) >= 0 && (desiredDiet[3] - array[3]) >= 0) {
				desiredDiet[0] -= array[0];
				desiredDiet[1] -= array[1];
				desiredDiet[2] -= array[2];
				desiredDiet[3] -= array[3];
				if (desiredDiet[0] == 0 && desiredDiet[1] == 0 && desiredDiet[2] == 0 && desiredDiet[3] == 0)
					counter++;
			}
		}
		if (counter > 0)
			System.out.println("YES");
		else
			System.out.println("NO");
scanner.close();
	}

}
