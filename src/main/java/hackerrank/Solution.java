package hackerrank;

import java.io.*;
import java.lang.reflect.Method;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*class Checker implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		
		if(o1.score>o2.score)
			return -1;
		else if(o1.score<o2.score)
			return 1;
		else
		{
			return o1.name.compareTo(o2.name);
		}
	}

	
   
}*/
class Singleton1{
	private String strr;
	private static volatile Singleton1 singleton;
	
	private Singleton1()
	{}
	
	public  static Singleton1 getInstance(String str)
	{
		if(singleton==null)
			synchronized(Singleton1.class){
			if(singleton==null)
			{ 
				return singleton= new Singleton1();
			}
		}
		return singleton;
	}
	

	
}
class Singleton {

	public String str;
	private static volatile Singleton singleton;

	private Singleton() {
		// TODO Auto-generated constructor stub

	}

	public static Singleton getSingleInstance(String order) {
		switch (order) {
		/*
		 * case "cake": return new Cake(); case "pizza": return new Pizza();
		 * default : return null;
		 */
		}

		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null)
					return singleton = new Singleton();
			}
		}
		return singleton;
	}

}

class Printer {
	public <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.println(element);
		}
	}

}

/*
 * public static PerformOperation isOdd() { return a->a%2!=0; } public static
 * PerformOperation isPrime() { return number-> {number == 2 || (number % 2 != 0
 * && LongStream .range(2, (long) Math.ceil(Math.sqrt(number + 1))) .filter(n ->
 * n % 2 != 0) .noneMatch(divisor -> number % divisor == 0) ); } } public static
 * PerformOperation isPalindrome() { return integer->
 * {String.valueOf(integer).equals(new
 * StringBuilder(intStr).reverse().toString());}
 * 
 * }
 */
class Add {
	void add(int... c) {
		int j = 0;
		for (int i : c) {

			if (j == 0)
				System.out.print(i);
			else {
				System.out.print("+" + i);
			}
			j += i;

		}
		System.out.println("=" + j);
	}
}

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

public class Solution {

	public static void main(String[] args) {
		listManipulation();
		arrayListManipulation();
		arrayListManipulationUsingArrayListOfArraylist();
		phoneBook();
		javaHashSet();
		comparatorUsingLambdaExpression();
		exceptionHandling();
		methodOverloadingChecker();
		
		
	}

	
	/**
	 * 
	 */
	private static void comparatorUsingLambdaExpression() {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine()); // here, we get NumberFormatException

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			testCases--;
		}

		Collections.sort(studentList, (s1, s2) -> {
			if (s1.getCgpa() > s2.getCgpa())
				return -1;
			else if (s1.getCgpa() < s2.getCgpa())
				return 1;
			else if (s1.getFname().compareTo(s2.getFname()) != 0) {
				return s1.getFname().compareTo(s2.getFname());
			} else {
				if (s1.getId() > s2.getId())
					return 1;
				else
					return -1;
			}
		});
		
		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}

	private static void exceptionHandling() {
		Scanner scanner = new Scanner(System.in);
		try {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			System.out.println(x / y);
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}

		scanner.close();
	}

	/**
	 * 
	 * 
	 */
	private static void listManipulation() {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int j = scanner.nextInt();
		for (int i = 0; i < j; i++) {
			list.add(scanner.nextInt());
		}
		int q = scanner.nextInt();

		for (int i = 0; i < q; i++) {
			int element = -1;
			scanner.nextLine();
			String s = scanner.nextLine();
			int index = scanner.nextInt();
			if ("Insert".equals(s)) {
				element = scanner.nextInt();
				list.add(index, element);
			} else {
				list.remove(index);
			}

		}
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		scanner.close();

	}

	private static void arrayListManipulationUsingArrayListOfArraylist() {
		Scanner scanner = new Scanner(System.in);
		int lines = scanner.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < lines; i++) {
			ArrayList<Integer> innerList = new ArrayList<Integer>();
			scanner.nextLine();
			int elements = scanner.nextInt();
			for (int j = 0; j < elements; j++) {
				innerList.add(scanner.nextInt());
			}
			list.add(innerList);
		}
		int q = scanner.nextInt();

		for (int i = 0; i < q; i++) {
			scanner.nextLine();
			int line = scanner.nextInt();
			int index = scanner.nextInt();
			try {
				System.out.println(list.get(line - 1).get(index - 1));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}

		}

	}

	private static void methodOverloadingChecker() {
		int count = 0;
		for (Method method : Printer.class.getDeclaredMethods()) {
			String name = method.getName();

			if (name.equals("printArray"))
				count++;
		}

		if (count > 1)
			System.out.println("Method overloading is not allowed!");

	}

	private static void phoneBook() {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<String, Integer> phonebook = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			String name = scanner.nextLine();
			int phone = scanner.nextInt();
			phonebook.put(name, phone);
		}
		scanner.nextLine();
		while (scanner.hasNext()) {
			String s = scanner.nextLine();
			System.out.println(phonebook.containsKey(s) ? s + "=" + phonebook.get(s) : "Not found");
		}
		scanner.close();
	}

	private static void arrayListManipulation() {
		Scanner scanner = new Scanner(System.in);
		int lines = scanner.nextInt();
		@SuppressWarnings("unchecked")
		List<Integer>[] list = new ArrayList[lines];

		for (int i = 0; i < lines; i++) {
			scanner.nextLine();
			int elements = scanner.nextInt();
			list[i] = new ArrayList<>();
			for (int j = 0; j < elements; j++) {
				list[i].add(scanner.nextInt());
			}
		}
		int q = scanner.nextInt();

		for (int i = 0; i < q; i++) {
			scanner.nextLine();
			int line = scanner.nextInt();
			int index = scanner.nextInt();
			try {
				System.out.println(list[line - 1].get(index - 1));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}

		}
		scanner.close();
	}

	private static long power(int n, int p) throws Exception {
		if (n == 0 && p == 0)
			throw new Exception("n and p should not be zero.");
		else if (n < 0 || p < 0)
			throw new Exception("n or p should not be negative.");

		else
			return (long) Math.pow(n, p);
	}

	private static void javaHashSet() {
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = scanner.next();
			pair_right[i] = scanner.next();
		}
		Set<String> set = new HashSet<>();
		for (int i = 0; i < pair_left.length; i++) {
			set.add(pair_left[i] + " " + pair_right[i]);
			System.out.println(set.size());
		}
		scanner.close();
	}
}