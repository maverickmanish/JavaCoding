package udemy.in28minutes;

import java.util.Arrays;

public class HCLTest {

	public static void main(String[] args) {

		int[] array = { 2, 3, 6, 8, 1, 5, 7, 4 };
		
		System.out.println(duplicate(array));

		printArray(sortArray(array));

	}

	private static void printArray(int[] sortArray) {
		System.out.println("sorted array : ");
		for (int k : sortArray) {
			System.out.print(k);
		}
		
	}

	public static int duplicate(int[] array) {

		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if ((i + 1) != array[i])
				return array[i];
		}
		return -1;
	}

	public static int[] sortArray(int[] array) {
		int temp = -1;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i-1; j++) {

				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}
		}
		return array;
	}

}
