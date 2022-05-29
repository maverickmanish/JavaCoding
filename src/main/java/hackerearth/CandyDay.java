package hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class CandyDay {

	static Integer candyTypes, perDayLimit;
	static Integer[] candyCounts, candyPriorities, sortedPriorites;
	static HashMap<Integer, ArrayList<Integer>> daycounter;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		candyTypes = scanner.nextInt();
		perDayLimit = scanner.nextInt();
		daycounter = new HashMap<>();
		scanner.nextLine();
		candyCounts = new Integer[candyTypes];
		candyPriorities = new Integer[candyTypes];
		Integer type, day;
		for (int i = 0; i < candyTypes; i++) {
			candyCounts[i] = scanner.nextInt();
		}
		scanner.nextLine();
		for (int i = 0; i < candyTypes; i++) {
			candyPriorities[i] = scanner.nextInt();
		}

		System.arraycopy(candyPriorities, 0, sortedPriorites, 0, candyTypes);
		Arrays.sort(sortedPriorites, Collections.reverseOrder());
		scanner.nextLine();
		Integer noOfQueries = scanner.nextInt();
		int j = 0;
		for (int q = 0; q < candyTypes; q++) {
			ArrayList al = new ArrayList<>();
			for (int p = 1; p <= perDayLimit; p++) {
				int temp = candyCounts[q], days = 0;
				while (temp > 0) {
					days++;
					temp -= p;
				}
				al.add(days);
			}
			daycounter.put(q, al);
		}

		while (j++ < noOfQueries) {
			scanner.nextLine();
			type = scanner.nextInt();
			day = scanner.nextInt();

			System.out.println(posibble(type, day));
		}
		scanner.close();
		
	}

	private static String posibble(Integer type, Integer day) {
		for (int i = sortedPriorites[0]; i >= candyPriorities[type]; i--) {
		}
		return null;
	}

}
