package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		/*
		 * @SuppressWarnings("resource") Scanner scanner = new Scanner(System.in);
		 * List<String> items = new ArrayList<String>(); for (int i = 0; i < 2; i++) {
		 * items.add(scanner.next()); } System.out.println("Unfiltered List :- " +
		 * items); String prefix = "JD";
		 * 
		 * List<String> filteredList = items.stream().filter(e ->
		 * (!e.startsWith(prefix))).collect(Collectors.toList());
		 * System.out.println("Unfiltered List :- " + filteredList);
		 * System.out.println("Unfiltered List :- " + items);
		 * 
		 * Stream<Integer> stream1 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9
		 * }); stream1.forEach(p -> System.out.println(p));
		 */

		Random random = new Random();

		// Five random integers

		random.ints(5, 34, 67).boxed().sorted().collect(Collectors.toList()).forEach(System.out::println);

		/*
		 * //Five random doubles between 0 (inclusive) and 0.5 (exclusive)
		 * 
		 * random.doubles( 5, 0, 0.5 ).sorted().forEach( System.out::println );
		 * 
		 * //Boxing long to Long so they can be collected
		 * 
		 * List<Long> longs = random.longs( 5 ).boxed().collect( Collectors.toList() );
		 * System.out.println(longs);
		 */
		System.out.println("Reduce functionality : ");
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
		int res = list2.parallelStream().reduce(1, (s1, s2) -> s1 * s2);
		System.out.println(res);

	}

}
