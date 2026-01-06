package codevita.tcs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class LongestProgressiveSequence {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int noOfElements = scanner.nextInt();
		int[] integerSequence = IntStream.range(0, noOfElements).map(i -> scanner.nextInt()).toArray();
		List<Integer> longest = new ArrayList<>();
		List<Integer> current = new ArrayList<>();
		Map<Integer, List<List<Integer>>> allProgressiveSequence = new HashMap<>();
		
		int previous = Integer.MIN_VALUE;
		
		for (int num : integerSequence) {
			if (current.isEmpty() || num >= previous) {
				current.add(num);
			} else {
				allProgressiveSequence
						.computeIfAbsent(current.size(), k -> new ArrayList<>())
						.add(new ArrayList<>(current));
				
				if (current.size() > longest.size()) {
					longest = new ArrayList<>(current);
				}
				
				current.clear();
				current.add(num);
			}
			previous = num;
		}
		
		// Final check
		if (!current.isEmpty()) {
			allProgressiveSequence
					.computeIfAbsent(current.size(), k -> new ArrayList<>())
					.add(new ArrayList<>(current));
			
			if (current.size() > longest.size()) {
				longest = new ArrayList<>(current);
			}
		}
		
		System.out.println("Longest Progressive Sequence: " + longest);
		System.out.println("all progressive sequences with their counts ");
		allProgressiveSequence.forEach((key, value) -> {
			System.out.printf("\n Sequence Length : %d :::", key);
			AtomicInteger i = new AtomicInteger(1);
			value.forEach(seq -> System.out.printf(" | Sequence: #%d: [%s]", i.getAndIncrement(), seq.toString()));
		});
	}
}
