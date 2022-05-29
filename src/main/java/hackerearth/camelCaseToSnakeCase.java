package hackerearth;

import java.util.Scanner;

public class camelCaseToSnakeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String camelCase = scanner.nextLine();
		String[] stringList = camelCase.split("(?=[A-Z])");
		System.out.println("the snake case is : " + String.join("_",stringList).toLowerCase());
		scanner.close();
	}
}
