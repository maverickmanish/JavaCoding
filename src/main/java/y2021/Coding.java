package y2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author mabhardwaj
 *
 */
public class Coding {
	private String name = "TATA";
	private Integer counter = 1;
	static Integer N;

	public void printOdd() {
		synchronized (this) {
			while (counter <= N) {
				if (counter % 2 == 0) {

					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				System.out.println("Odd value is : " + counter);
				counter++;
				notify();
			}
		}
	}

	public void printEven() {
		synchronized (this) {
			while (counter <= N) {
				if (counter % 2 != 0) {

					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				System.out.println("Even value is : " + counter);
				counter++;
				notify();
			}
		}
	}

	public static void main(int args) {
		System.out.println("main() overloaded" + " method 1 Executing");
	}

	// Overloaded main method 2
	// According to us this overloaded method
	// Should be executed when character is passed
	public static void main(char args) {
		System.out.println("main() overloaded" + " method 2 Executing");
	}

	// Overloaded main method 3
	// According to us this overloaded method
	// Should be executed when double value is passed
	public static void main(Double[] args) {
		System.out.println("main() overloaded" + " method 3 Executing");
	}

	public static int main(Character args) {
		return 1;
	}

	public static void main(String[] args) {

		/*
		 * List<Integer> arraylist = Arrays.asList(new Integer[] {1,2,3,4,5});
		 * ListRotation(arraylist,3);
		 * 
		 * Integer[] array= new Integer[] {2,3,4,6,7}; ArrayRotation(array,3);
		 * 
		 * for (Integer integer : array) { System.out.println(integer); }
		 * 
		 * Integer[] array1= new Integer[] {1,2,3,4,5}; Integer[] array2 =new Integer[]
		 * {4,5,1,2,3};
		 * 
		 * System.out.println(isRotation(array2,array1));
		 * 
		 * 
		 * 
		 * Scanner scanner = new Scanner(System.in); String string= scanner.nextLine();
		 * System.out.println(camelCaseToSnake2(string));
		 * System.out.println(snakeToCamel(camelCaseToSnake2(string)));
		 * 
		 * System.out.println(mostFrequent(new Integer[]
		 * {1,2,3,5,2,2,3,3,3,4,4,4,1,4}));
		 * 
		 * System.out.println(Arrays.toString( commonArray(new Integer[] { 1, 2, 2, 2,
		 * 3, 3, 3, 4, 4, 4, 4 }, new Integer[] { 1, 4, 5, 7, 8, 9 })));
		 * System.out.println(uniqueArray(new Integer[] { 1, 4, 3, 5, 6, 1, 7, 5, 4, 6,
		 * 7, 3, 5, 6, 4, 2, 4 }));
		 * 
		 * System.out.println(breakString("welcome to mettl",'l'));
		 * 
		 * System.out.println(isPrimeChecker(88)); generatePrimes(100);
		 * 
		 * SOE(); System.out.println(list.get(7)); System.out.println(list.get(17));
		 * 
		 * 
		 * System.out.println(coins2(10));
		 * 
		 * System.out.println(factorial(100));
		 * 
		 * 
		 * System.out.println(trailingZeros(100));
		 * 
		 * System.out.println(pallindrome("levell"));
		 * 
		 * System.out.println(get2ndSmallestNumber(new int[]{5,4,3,3,2,2,6,7,1,1}));
		 * 
		 * System.out.println(isAnagram("rakesh", "krashe"));
		 * 
		 * System.out.println(isPanagram("The quick brown fox jumps over the lazy dog"))
		 * ;
		 * 
		 * System.out.println(mangoDistribution(5, 3));
		 * 
		 * 
		 * char ch=127; ch++; System.out.println(ch+"="+(int)ch);
		 * 
		 * final int countt = 0; Arrays.asList(new Integer[] { 1, 2, 2, 2, 3, 3, 3, 4,
		 * 4, 4, 4 }); Employee ee = new Employee(); Arrays.stream(new Integer[] { 1, 2,
		 * 2, 2, 3, 3, 3, 4, 4, 4, 4 }).map(e -> {
		 * 
		 * return e; }).forEach(System.out::println); ;
		 * 
		 * String s[] = { "hybernate", "java", "object" }; Arrays.sort(s); for (String
		 * string : s) { System.out.println(string); }
		 * 
		 * int var = 0;
		 * 
		 * if (var == 0) System.out.println("yes");
		 * 
		 * Will Throw Class Cast Exception Coding o = (Coding) new Object();
		 * System.out.println(o.name);
		 * 
		 * System.out.println("where is out"); String s1 = "manish"; String s2 =
		 * "shmani"; char ch = 65; System.out.println("check it");
		 * System.out.println(ch);
		 * 
		 * System.out.println((s1 + s1).indexOf(s2) != -1);
		 * 
		 * System.out.println(stringDuplicateRemove("manishkumarbhardwaj"));
		 * 
		 * System.out.println(longestSubstring("ABDEFGABEF".toLowerCase()));
		 */
		
		/* MultiThreading */
		N = 10;
		Coding cd = new Coding();
		Thread t = new Thread(() -> {
			cd.printOdd();
		});
		Thread t2 = new Thread(() -> {
			cd.printEven();
		});

		t.start();
		t2.start();
		String strOrig="Deepak Patel";
		
		/* Vowels removing from a string */
		
		System.out.println(strOrig.replaceAll("[aeiouAEIOU]", ""));

		String s="Deepak Patel";

		String[] array= s.split("[aeiou]");
		System.out.println(String.join("",array));
	
		System.out.println(" Exception in Add "+ add(4,0));
	}
	

	public static String stringDuplicateRemove(String s) {
		String ss = "";
		Set<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++)
			set.add(s.charAt(i));
		for (Character character : set)
			ss += character;
		return ss;
	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		return grades.stream().map((e) -> {
			return ((e < 38 || e % 5 < 3) ? e : e + 5 - e % 5);
		}).collect(Collectors.toList());
	}

	public static int mangoDistribution(int M, int N) {
		if (M < N)
			return 0;
		else
			return b_c(M + N - 1, N - 1);
	}

	private static int b_c(int a, int b) {
		if (b > a - b)
			b = a - b;
		int res = 1;

		for (int i = 0; i < b; i++) {
			res *= (a - i);
			res /= (i + 1);
		}

		return res;
	}

	public static int firstRepeatElementArray(int[] arr) {
		Set<Integer> set = new HashSet<>();
		int min_index = -1;
		for (int i = arr.length - 1; i >= 0; i++) {
			if (set.contains(arr[i]))
				min_index = i;
			else
				set.add(arr[i]);
		}
		if (min_index != -1)
			return arr[min_index];
		else
			return -1;
	}

	/* all letters of alphabets */
	public static Boolean isPanagram(String s) {
		Boolean[] allLetters = new Boolean[26];
		Arrays.fill(allLetters, false);
		String operations = s.toUpperCase();
		for (int i = 0; i < operations.length(); i++) {
			if (operations.charAt(i) >= 'A' && operations.charAt(i) <= 'Z')
				allLetters[operations.charAt(i) - 'A'] = true;
		}
		for (Boolean boolean1 : allLetters) {
			if (!boolean1)
				return false;
		}
		return true;
	}

	/* both string contains same letters */
	public static Boolean isAnagram(String s1, String s2) {
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);
	}

	public static Integer get2ndSmallestNumber(int[] arr) {
		int smallest = arr[0], smallest2 = arr[1];
		Set<Integer> set = new TreeSet<>();

		for (int integer : arr) {
			set.add(integer);
		}
		Iterator<Integer> iterator = set.iterator();
		iterator.next();

		return iterator.next();

	}

	public static Boolean pallindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j)
			if (s.charAt(i++) != s.charAt(j--))
				return false;
		return true;
	}

	public static long factorial(int n) {

		if (n == 0)
			return 1;

		return (n * factorial(n - 1));
	}

	public static int trailzeros(int N) {
		Long fact = factorial(N);
		int count = 0;
		while (fact % 10 == 0) {
			count++;
			fact /= 10;
		}
		return count;
	}

	public static int trailingZeros(int N) {
		int count = 0;
		for (int i = 5; N / i >= 1; i *= 5)
			count += N / i;
		return count;
	}

	public static Long coins(Integer N) {
		Long sum = 0L;
		for (int i = 1; i <= N; i++) {
			sum = sum + i * i;
		}
		return sum;
	}

	public static Integer coins2(Integer N) {
		return ((N * (N + 1) * (2 * N + 1)) / 6);
	}

	static Integer Max_size = 10000000;
	static List<Integer> list = new ArrayList<>();

	public static void SOE() {
		list.clear();
		Boolean[] isPrime = new Boolean[Max_size];
		Arrays.fill(isPrime, true);

		for (int i = 2; i * i < Max_size; i++) {
			if (isPrime[i]) {
				for (int k = i * i; k < Max_size; k += i)
					isPrime[k] = false;
			}

		}
		for (int i = 2; i < Max_size; i++)
			if (isPrime[i])
				list.add(i);
	}

	public static void generatePrimes(int N) {
		for (int i = 2; i < N; i++) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			System.out.print(flag ? " " + i : "");
		}
	}

	private static Boolean isPrimeChecker(Integer a) {
		Boolean flag = true;
		for (int i = 2; i <= a / 2; ++i) {
			if (a % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	private static String reverseStringWordwise(String string) {
		String[] array = string.split(" ");
		String result = "";
		for (int i = array.length - 1; i >= 0; i--) {
			result += array[i] + " ";
		}
		return result.substring(0, result.length() - 1);
	}

	private static String breakString(String s, Character c) {
		String[] array = s.split(c.toString());
		return String.join("", array);

	}

	public static Integer uniqueArray(Integer[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer integer : a) {
			if (map.containsKey(integer))
				map.put(integer, map.get(integer) + 1);
			else
				map.put(integer, 1);
		}

		for (Integer integer : a) {
			if (map.get(integer) == 1)
				return integer;
		}
		return null;

	}

	public static Boolean oneStringAway(String s1, String s2) {
		if (Math.abs(s1.length() - s2.length()) > 1)
			return false;
		if (s1.length() == s2.length())
			return sameLength(s1, s2);
		else if (s1.length() > s2.length())
			return diffLength(s1, s2);
		else
			return diffLength(s2, s1);
	}

	private static Boolean sameLength(String s1, String s2) {
		int count_diff = 0, i = 0;
		while (i < s1.length() && count_diff < 2) {
			if (s1.charAt(i) != s2.charAt(i))
				count_diff++;
			i++;
		}
		if (count_diff > 1)
			return false;
		else
			return true;
	}

	private static Boolean diffLength(String s1, String s2) {
		int i = 0, count_diff = 0;
		while (i < s2.length() && count_diff < 2) {
			if (s1.charAt(i + count_diff) != s2.charAt(i))
				count_diff++;
			else
				i++;
		}
		if (count_diff > 1)
			return false;
		else
			return true;

	}

	public static Integer[] commonArray(Integer[] a, Integer[] b) {
		List<Integer> arrayList = new ArrayList<>();
		int aa = 0, bb = 0;
		while (aa < a.length && bb < b.length) {
			if (a[aa] < b[bb])
				aa++;
			else if (a[aa] > b[bb])
				bb++;
			else {
				arrayList.add(b[bb++]);
				aa++;
			}
		}
		Integer[] array = new Integer[arrayList.size()];
		arrayList.toArray(array);
		return array;

	}
	
	public static int add(int a, int b)
	{
		try {
			return a+b;
		} catch (Exception e) {
			System.out.println("ex");
			return 3;
		}
		finally {
			return 1;
		}
	}

	public static Integer mostFrequent(Integer[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		Integer item = null, item_count = -1;
		for (Integer integer : array) {
			if (map.containsKey(integer))
				map.put(integer, map.get(integer) + 1);
			else
				map.put(integer, 1);

			if (map.get(integer) > item_count) {
				item = integer;
				item_count = map.get(integer);
			} else if (map.get(integer) == item_count) {
				if (item > integer)
					item = integer;
			}
		}
		return item;

	}

	public static String snakeToCamel(String string) {
		String[] array = string.split("_");
		String camel = array[0];
		for (int i = 1; i < array.length; i++) {
			camel += Character.toUpperCase(array[i].charAt(0)) + array[i].substring(1);
		}
		return camel;
	}

	public static String camelCaseToSnake(String string) {
		String[] array = string.split("(?=[A-Z])");
		String snake = "";
		for (String string2 : array) {
			snake += Character.toLowerCase(string2.charAt(0)) + string2.substring(1) + "_";
		}
		return snake.substring(0, snake.length() - 1);
	}

	public static String camelCaseToSnake2(String string) {
		String[] array = string.split("(?=[A-Z])");

		return String.join("_", array).toLowerCase();
	}

	public static boolean isRotation(Integer[] a, Integer[] array2) {
		if (a.length != array2.length)
			return false;
		int i = 0;
		for (; i < array2.length; i++) {
			if (a[0] == array2[i])
				break;
		}

		if (i == array2.length)
			return false;
		for (int j = 0; j < a.length; j++) {
			if (a[j] != array2[(j + i) % a.length])
				return false;
		}
		return true;

	}

	public static void ListRotation(List<Integer> arraylist, int n) {

		Collections.rotate(arraylist, n);
		arraylist.forEach((e) -> {
			System.out.println(" " + e.toString());
		});
	}

	public static void ArrayRotation(Integer[] array, int n) {
		if (n == 0)
			return;
		int first = array[0];
		int i = 1;
		for (; i < array.length; i++) {
			array[i - 1] = array[i];
		}
		array[i - 1] = first;
		ArrayRotation(array, --n);
	}

	public static String longestSubstring(String s) {

		/*
		 * CustomValidators BeanProcessr and destroying Oath protocols java 8 Problem
		 * spring security Mockito and Junit
		 */

		Boolean[] characterArray = new Boolean[26];
		Arrays.fill(characterArray, false);

		int maxLength = 0, startIndex = 0;
		String longestString = "", substring = "";
		for (int i = 0; i < s.length();) {

			if (characterArray[(s.charAt(i) - 97)]) {
				Arrays.fill(characterArray, false);
				if (substring.length() > maxLength) {
					longestString = substring;
					maxLength = longestString.length();
				}
				startIndex = i = s.substring(0, i).lastIndexOf(s.charAt(i)) + 1;

				System.out.println(" value of i in if " + i + " " + characterArray[(s.charAt(i) - 97)] + " substring : "
						+ substring);

			} else {

				substring = s.substring(startIndex, i + 1);
				characterArray[(s.charAt(i) - 97)] = true;
				i++;
				System.out.println(" value of i in else " + i);
			}

		}
		return longestString;

	}
}
