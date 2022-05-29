package codevita.tcs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestProgressiveSequence {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		ArrayList<Integer> progressive = new ArrayList<>();
		Integer noOfElements = scanner.nextInt(), maxNoOfElements = new Integer(0), previous = new Integer(-999999999),
				maxNoOfElements2 = new Integer(0);
		Integer[] integerSequence = new Integer[noOfElements];

		for (int i = 0; i < noOfElements; i++) {
			integerSequence[i] = scanner.nextInt();
		}

		scanner.close();

		for (Integer integer : integerSequence) {

			if (previous <= integer) {
				System.out.print("If block ");
				progressive.add(integer);
				maxNoOfElements2++;
			} else {
				if (maxNoOfElements < maxNoOfElements2) {
					System.out.print("else block  ");
					maxNoOfElements = maxNoOfElements2;
					map.put(maxNoOfElements, progressive);
					progressive.clear();
					progressive.add(integer);
					maxNoOfElements2 = 1;
				}
			}
			previous = integer;
			System.out.println("progressive List " + progressive.toString());
		}

		System.out.println(maxNoOfElements);
		ArrayList<Integer> retrunList = map.get(maxNoOfElements);
		Object[] returnProgressiveArray = retrunList.toArray();
		System.out.println("Longest Proggressive Sequence : ");
		for (Object integer : returnProgressiveArray) {
			System.out.print(" " + integer);
		}

		System.out.println("all progresive sequences with their counts ");
		for (Integer integer : map.keySet()) {
			System.out.println("Progressive Sequence with count : " + integer + " is : " + map.get(integer).toString());
		}
	}
}
