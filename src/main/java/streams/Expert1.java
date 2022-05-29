package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Expert1 {

	public static void main(String[] args) {

		Integer[] data = new Integer[] { 1, 2, 3, 4, 4 };
		Stream<Integer> stream = Stream.of(data);
		stream.forEach(System.out::println);

		Stream<Integer> stream2 = Arrays.stream(data);

		String[] myArray = new String[] { "bob", "alice", "paul", "ellie" };
		Stream<String> myStream = Arrays.stream(myArray);

		Stream<String> myStream3 = myStream.filter(s -> s.length() > 4).map(String::toUpperCase);

		String[] myArray2 = myStream3.toArray(String[]::new);

		for (String string : myArray2) {
			System.out.println(string);
		}

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 23; i++) {
			list.add(i);
		}

		Integer reduced = list.stream().reduce(0, (a, b) -> a + b);

		System.out.println(reduced);
		

	}

}
