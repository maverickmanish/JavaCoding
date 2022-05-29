package hackerearth;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Listy {
	private long keyy;

	public Listy(long keyy) {
		super();
		this.keyy = keyy;

	}

	public long getKeyy() {
		return keyy;
	}

	public void setKeyy(long keyy) {
		this.keyy = keyy;
	}

	public int countSetBits(long number) {
		int count = 0;
		while (number > 0) {
			++count;
			number &= number - 1;
		}
		return count;
	}

}

public class NoOfSetBits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < T; i++) {
			scanner.nextLine();
			Long[] array = Stream.of(scanner.nextLine().trim().split(" ")).map(Long::parseLong).toArray(Long[]::new);
			List<Listy> list = Arrays.stream(array).map(Listy::new).collect(Collectors.toList());
			Collections.sort(list, (o1, o2) -> o1.countSetBits(o1.getKeyy()) - o2.countSetBits(o2.getKeyy()));
			list.forEach(o -> System.out.print(o.getKeyy() + " "));
			System.out.println();

		}

		scanner.close();

		
	}

}
