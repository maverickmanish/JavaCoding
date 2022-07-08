package y2022;

class Student {
}

public class _1_NagarroCoreJavaTest {
	/*
	 * 5. str static behaviour Should have been initialized at the declaration or
	 * within static block final static String str;
	 */

	static {
		String str = "Hi";
		str = "XYZZ";
	}

	private void display(Object O) {
		System.out.println("Object");
	}

	private void display(String O) {
		System.out.println("String");
	}

	private void display(Student O) {
		System.out.println("Student");
	}

	public static void main(String[] args) {
		/*
		 * 1. Invalid assignment Operator syntactic COMPILER error String test=
		 * ""test"";
		 */

		/* 2. StringBuilder append methods working */
		stringBufferOperations();

		/* 3. try catch and FINALLY(WINNER) behavior with return */
		System.out.println(exceptionHandlingWithReturn());

		/* 4. str.endsWith("") */
		stringComparisonWithObject();
		
		
		/*
		 * 5. overloaded methods when passing null for only Object 
		 * works but other case
		 * doesn't work as there's no hierarchical relation
		 * display(null);
		 */
	}

	private static void stringComparisonWithObject() {
		String str = "XYZ";
		/*
		 * Type not compatible COMPILER error System.out.println(str.compareTo(new
		 * Student()));
		 */
		System.out.println(str.endsWith(""));
	}

	private static int exceptionHandlingWithReturn() {
		try {
			throw new Exception();
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}

	private static void stringBufferOperations() {
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operate(a, b);
		System.out.println(a + " " + b);
	}

	private static void operate(StringBuffer x, StringBuffer y) {
		x.append(y);
		y = x.append("C");
		y.append("D");
	}
}
