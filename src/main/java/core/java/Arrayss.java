package core.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author mabhardwaj
 *
 */
public class Arrayss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[] { 0, 6, 7, 8 }; // inline initialization
		int array1[] = new int[5]; // by default initialized with zeros
		int array2[] = { 0, 6, 7, 8 }; // block initialization

		System.out.println("for loop approach ---  ");
		for (int i = 0; i < array2.length; i++)
			System.out.println(i + "element .   :" + array2[i]);
		System.out.println("for each approach ---  ");
		for (int single : array) {
			System.out.println(single);
			single = 5;
		}

		System.out.println("\n\n\n Array before reversing the elements : " + Arrays.toString(array));
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		System.out.println("Array after reversing the elements : " + Arrays.toString(array));

		System.out.println("\n\n\n**********Now sorting strategy******");

		Integer primes[] = { 13, 17, 3, 5 };
		System.out.println("array before sorting : " + Arrays.toString(primes));
		System.out.println("sorting array in descending order");

		Arrays.sort(primes,Collections.reverseOrder());
		System.out.println("array before reversing primitive array  : " + Arrays.toString(primes));
		ArrayUtils.reverse(primes);
		System.out.println("array after sorting in reverse order  : " + ArrayUtils.toString(primes));
		ArrayUtils.reverse(primes);

		System.out.println("Antother way to reverse the elements of array using collections ");
		List<Integer> list = Arrays.asList(primes);
		Collections.reverse(list);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		primes =  list.toArray(new Integer[list.size()]);
		System.out.println("array after sorting in reverse order  : " + ArrayUtils.toString(primes));

		String[] fruits = { "apple", "banana", "orange", "grapes" };
		System.out.println("String array before sorting : " + Arrays.toString(fruits));
		System.out.println("Sorting array in descending order");
		Arrays.sort(fruits, Collections.reverseOrder());
		// only work with object arrays, not with
		// primitive arrays

		System.out.println("array after sorting : " + Arrays.toString(fruits));

		System.out.println("\n\n\n right way to print 2-D array using util function ");
		int[][] cubes = { { 1, 1 }, { 2, 4, 9 }, { 3, 9 }, { 4, 16 } };
		System.out.println(Arrays.toString(cubes));
		System.out.println("new way .. : " + Arrays.deepToString(cubes));

		System.out.println("\n\n\nEquality of two arrays ");
		int prime[][] = { { 3, 5, 7 } };
		int odd[][] = { { 3, 5, 8 } };

		System.out.println((Arrays.deepEquals(prime, odd)) ? "equal" : "not equal");

		System.out.println(" \n\n\nArray  to string ");
		String delimiter = "_";
		String arrayToString = arrayToStringFormat(fruits, delimiter);

		System.out.println("Array to string with delimited : " + arrayToString);
	}

	
	
	
	private static String arrayToStringFormat(String[] fruits, String delimiter) {
		StringBuilder string = new StringBuilder();

		for (String fruit : fruits) {
			string.append(fruit).append(delimiter);
		}
		return string.deleteCharAt(string.length() - 1).toString();
	}

}
