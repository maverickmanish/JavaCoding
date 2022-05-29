package core.java;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input");
		
	
		findIt(scanner);
		scanner.close();
	}

	private static void findIt(Scanner scanner) {
		Integer noOfElements = scanner.nextInt();
		ArrayList<Integer> array = new ArrayList<>();
		Integer previous = -9999, length = 0, length2 = 0;
		System.out.print("\n 1. Sequence ");
		for (int i = 0; i < noOfElements; i++) {
			
			array.add(scanner.nextInt());
			if (previous < array.get(i)) {
				previous = array.get(i);
				length2++;
				System.out.print(" "+array.get(i)+"");
			}

		}
		

		for (int i = 1; i < noOfElements; i++) {
			if (length < length2)
				length = length2;
System.out.print("\n"+(i+1)+"Sequence ");
			length2 = 0;
			previous = -9999;
			for (int j = i; j < noOfElements; j++) {
				if (previous < array.get(j)) {
					previous = array.get(j);
					length2++;
				System.out.print(" "+array.get(j)+"");
				}
			}
		}

		System.out.println("Output");
		System.out.println(length+1);
	}

}
