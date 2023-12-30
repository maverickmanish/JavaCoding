package udemy.in28minutes;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore + ", noOfStudents="
				+ noOfStudents + "]";
	}
}

public class Java8 {

	public static void main(String[] args) throws IOException {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(8);
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(5);
		numbers.add(8);
		numbers.add(8);
		/*
		 * JAVA 9 provides convenience static factory method for this List<Integer> list =
		 * List.of(1,2,3,4,5);
		 */
		
		List<List<Integer>> marksByStudents = List.of (
				  List.of (60, 70, 80),
				  List.of(50, 70, 85),
				  List.of(65, 70, 75)
				); 
		
		
		Double collect = marksByStudents.stream().flatMap(List::stream).collect(Collectors.averagingInt(Integer::intValue));
		System.out.println(collect);
		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

		List<String> courses = Arrays.asList(
				"Spring", "Spring Boot Advanced", "API", "Microservices", "Kubernates and Docker");
		
		
		filterStringContent(courses, System.out::println);

		evenNumberSquares(numbers, e -> e % 2 == 0, x -> x * x);

		BinaryOperator<Integer> accumulator = Integer::sum;
		Integer reduce = numbers.stream().reduce(0, accumulator);
		System.out.println(reduce);
		Integer reduce2 = numbers.stream().reduce(0, (x, y) -> x + y);
		System.out.println(reduce2);
		Integer reduce3 = numbers.stream().reduce(0, (x, y) -> x > y ? x : y);
		System.out.println(reduce3);
		Integer reduce4 = numbers.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y);
		System.out.println(reduce4);

		Integer reduce5 = numbers.stream().reduce(0, (x, y) -> x + (y * y));
		System.out.println(reduce5);
		Integer reduce6 = numbers.stream().map(x -> x * x).reduce(0, (x, y) -> x + y);
		System.out.println(reduce6);

		numbers.stream().distinct().sorted().forEach(System.out::println);

		courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		List<Integer> squares = numbers.stream().map(x -> x * x).collect(Collectors.toList());
		squares.forEach(System.out::println);

		Supplier<Integer> randomInteger = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		System.out.println(randomInteger.get());

		UnaryOperator<Integer> getOne = e -> e * 4;
		System.out.println(getOne.apply(5));

		List<Course> coursesList = new ArrayList<>();
		coursesList.add(new Course("Spring", "Framework", 56, 24566));
		coursesList.add(new Course("Spring Boot", "Framework", 33, 448));
		coursesList.add(new Course("API", "Microservices", 76, 3323));
		coursesList.add(new Course("Fullstack", "Fullsatack", 120, 22222));
		coursesList.add(new Course("Microservices", "Microservices", 99, 11111));
		coursesList.add(new Course("Kubernetes", "Spring Cloud", 100, 22222));
		coursesList.add(new Course("Docker", "Spring Cloud", 33, 11232));
		coursesList.add(new Course("AWS", "Microservices", 41, 11));
		coursesList.add(new Course("Azure", "Spring Cloud", 12, 34565));
		coursesList.add(new Course("Spring Cloud", "Spring Cloud", 23, 1111));
		coursesList.add(new Course("JAVA 8", "Framework", 70, 1234));

		// allMatch , noneMatch , anyMatch
		System.out.println("NONE-Match");
		System.out.println(coursesList.stream().noneMatch(c -> c.getReviewScore() > 90));

		coursesList.stream().sorted(Comparator.comparing(Course::getNoOfStudents).reversed())
				.collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("final sorting");

		coursesList.stream()
				.sorted(Comparator.comparing(Course::getNoOfStudents).reversed()
						.thenComparing(Comparator.comparing(Course::getReviewScore)))
				.collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("skip and limit ");

		coursesList.stream().sorted(Comparator.comparing(Course::getNoOfStudents).reversed()).limit(5)
				.collect(Collectors.toList()).forEach(System.out::println);
		coursesList.stream().sorted(Comparator.comparing(Course::getNoOfStudents).reversed()).skip(2)
				.collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("---"+coursesList.stream().collect(Collectors.groupingBy(Course::getCategory)));

		System.out.println("this is "
				+ coursesList.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
		System.out.println("Requirement " + coursesList.stream().collect(Collectors.groupingBy(Course::getCategory,
				Collectors.mapping(Course::getNoOfStudents, Collectors.toList()))));

		
		System.out.println(coursesList.stream().collect(Collectors.groupingBy(Course::getCategory,
				Collectors.maxBy(Comparator.comparing(Course::getReviewScore))
				)));

		Map<String, List<Course>> resultCourses = coursesList.stream()
				.collect(Collectors.groupingBy(
						Course::getCategory,
						Collectors.collectingAndThen(
								Collectors.toList(),
								cs -> cs.stream()
										.sorted(Comparator.comparing(Course::getReviewScore).reversed())
										.collect(Collectors.toList())
						)
				));

		List<String> g = Arrays.asList("geeks", "for", "geeks");

		// Collect the list as map
		// by groupingBy() method
		Map<String, Long> result = g.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<String, Long> result2 = g.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

		// Print the result
		System.out.println("result :"+result);

		Map<String, Double> productPrice = new HashMap<>();
		Map<String, Double> sortedProductPrice = new LinkedHashMap<>();

		// add value
		productPrice.put("Rice", 6.9);
		productPrice.put("Flour", 3.9);
		productPrice.put("Sugar", 4.9);
		productPrice.put("Milk", 3.9);
		productPrice.put("Egg", 1.9);

		/*for(Map.Entry<String, Double> entry : productPrice.entrySet()) {
			  if(entry.getValue()==6.9) {
				  productPrice.remove(entry.getKey());
			  }
			}*/
		 productPrice.remove("Egg");
		
		 
		 
		System.out.println(productPrice.entrySet().stream().filter(e -> e.getValue() == 3.9)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));

		productPrice.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEachOrdered(x -> sortedProductPrice.put(x.getKey(), x.getValue()));

		System.out.println(sortedProductPrice);
		IntStream.rangeClosed(1, 10).forEach(System.out::println);

		System.out.println(IntStream.iterate(1, e -> e + 2).limit(10).peek(System.out::println).sum());
		System.out.println(IntStream.iterate(2, e -> e * 2).limit(10).peek(System.out::println).sum());

		System.out.println(IntStream.iterate(1, e -> e + 2).limit(10).boxed().collect(Collectors.toList()));

		System.out.println(LongStream.rangeClosed(1, 50).reduce(1, (x, y) -> x * y));
		System.out.println(LongStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,
				BigInteger::multiply));

		System.out.println(courses.stream().peek(System.out::println).filter(c -> c.length() > 11)
				.map(String::toUpperCase).peek(System.out::println).findFirst());
		
		/*	
		Files.lines(Paths.get("text.txt")).map(str -> str.split(" ")).flatMap(Arrays::stream).distinct().sorted()
				.forEach(System.out::println);
		
		Files.lines(Paths.get("."))
		.filter(Files::isDirectory)
		.forEach(System.out::println);*/
		
		Map<String,Integer> map= new HashMap<>();
		map.put("A", 10);
		map.put("B", 11);
		map.put("C", 12);
		map.put("D", 15);
		map.put("E", 67);

		for (Map.Entry<String, Integer> entry :map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue()+" "+entry.toString());
		}
		
		map.forEach((k,v)-> System.out.println(" k "+k+" v: "+v));
		
	}
	/* Behavior as an argument */

	private static void evenNumberSquares(List<Integer> numbers, Predicate<? super Integer> isEven,
			Function<? super Integer, ? extends Integer> squareFunction) {
		numbers.stream().filter(isEven).map(squareFunction).forEach(System.out::println);
	}

	private static void filterStringContent(List<String> courses, Consumer<? super String> action) {
		courses.stream().filter(e -> e.contains("Spring")).forEach(action);
	}

}
