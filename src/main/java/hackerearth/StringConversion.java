package hackerearth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MapExample {
	int key;
	int value;

	public MapExample() {
		// TODO Auto-generated constructor stub
	}

	public MapExample(int key, int value) {
		super();
		this.key = key;
		this.value = value;
	}

}

public class StringConversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();
		for (int i = 0; i < T; i++) {
			String s1=scanner.nextLine().trim();
			Stream.of(s1.toCharArray()).collect(Collectors.toMap( a-> a, null));
			
		}

	}

}
