package hackerearth;

import java.util.Scanner;
import java.util.stream.Stream;

public class MagicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Q = scanner.nextInt();
		scanner.nextLine();
		Long[] A = Stream.of(scanner.nextLine().trim().split(" ")).map(Long::parseLong).toArray(Long[]::new);
		Long[] B = Stream.of(scanner.nextLine().trim().split(" ")).map(Long::parseLong).toArray(Long[]::new);

		for (int i = 0; i < Q; i++) {
			int flag = scanner.nextInt();
			int L = scanner.nextInt();
			int R = scanner.nextInt();
			boolean AFlag = false;
			if (flag == 1)
				AFlag = true;
			long sum = 0;
			L--;
			while (L < R) {
				if (AFlag) {
					sum += A[L++];
					AFlag = false;
				} else {
					sum += B[L++];
					AFlag = true;
				}

			}
			System.out.println(sum);
			scanner.nextLine();
		}
	}

}
