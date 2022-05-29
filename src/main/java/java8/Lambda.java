package java8;

import java.util.ArrayList;
import java.util.List;

public class Lambda {

	interface IntegerMath {
		int operation(int a, int b);
	}

	public int operateBinary(int a, int b, IntegerMath operate) {
		return operate.operation(a, b);
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);

		// old way of iterating
		for (Integer element : list) {
			System.out.println(element);
		}

		System.out.println("-----------------");

		list.forEach(System.out::println);
		
		// new way using lambda to iterate over a list
		list.forEach(e -> {
			System.out.println(e);
		});

		Lambda myApp = new Lambda();
		IntegerMath addition = (a, b) -> a + b;
		System.out.println(addition);
		IntegerMath subtraction = (a, b) -> a - b;
		System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
		System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));
	}
}
