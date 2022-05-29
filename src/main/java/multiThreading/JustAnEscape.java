package multiThreading;

import java.util.Arrays;

public class JustAnEscape {
	public static void main(String[] args) {
		int[] array = { 23, 43, 56, 97, 32 };
		int startValue = 100;
		int sum = Arrays.stream(array).reduce(startValue, (x, y) -> x + y);
		System.out.println(sum);
		sum = Arrays.stream(array).reduce(startValue, Integer::sum);
		System.out.println(sum);
	}
}
