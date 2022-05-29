package hackerearth;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayPrint {
	public static int N = 0;
	public static Integer[][] array;
	public static boolean flag2 = false, flag1 = false;

	public static boolean isValid(int row, int col, int checkVal) {
		return (row > -1 && col > -1 && row < N && col < N) && array[row][col] == checkVal;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();

		Set<Integer> setOf2 = new HashSet<>();
		array = new Integer[N][N];

		for (int i = 0; i < N; i++) {
			setOf2.clear();
			scanner.nextLine();
			for (int j = 0; j < N; j++) {

				array[i][j] = scanner.nextInt();
				if (!flag2)
					setOf2.add(array[i][j]);

			}
			if (!flag2 && setOf2.contains(2) && setOf2.size() == 1)
				flag2 = true;

		}

		for (int i = 0; i < N; i++) {
			//System.out.println("sequence No : " + i);
			if (array[0][i] == 1)
				if (!flag1) {
					flag1 = true;
				break;
				}

		}
		if (!flag2) {
			for (int i = 0; i < N; i++) {
				//System.out.println("sequence No : " + i);
				if (array[i][0] == 2)
					if (!flag2) {
						flag2 = true;
						break;
					}
			}
		}
		//System.out.println("Flag status : \n\t  1 --> " + flag1 + "\n\t  2 --> " + flag2);
		System.out.println((flag1 && flag2) ? "AMBIGUOUS" : (!flag2 && !flag1) ? "0" : (flag2 && !flag1) ? "2" : "1");

	}

	public static void findTheLength2(int r, int c, Integer[][] array) {
		if (flag1)
			return;

		if (!flag1 && isValid(r + 1, c, 1)) {
			//System.out.println("121[" + r + "][" + c + "]->" + array[r][c]);
			findTheLength(r + 1, c, array);

		}
		if (!flag1 && isValid(r + 1, c - 1, 1)) {
		//	System.out.println("126[" + r + "][" + c + "]->" + array[r][c]);
			findTheLength(r + 1, c - 1, array);
		}
		if (!flag1 && isValid(r + 1, c + 1, 1)) {
		//	System.out.println("121[" + r + "][" + c + "]->" + array[r][c]);
			findTheLength(r + 1, c + 1, array);

		}
		if (r == array.length - 1)
			flag1 = true;
	}

	public static void findTheLength(int r, int c, Integer[][] array) {

		if (flag2)
			return;

		if (!flag2 && isValid(r, c + 1, 1)) {
		//	System.out.println("121[" + r + "][" + c + "]->" + array[r][c]);
			findTheLength(r, c + 1, array);

		}
		if (!flag2 && isValid(r - 1, c + 1, 1)) {
		//	System.out.println("126[" + r + "][" + c + "]->" + array[r][c]);
			findTheLength(r - 1, c + 1, array);
		}
		if (!flag2 && isValid(r + 1, c + 1, 1)) {
		//	System.out.println("121[" + r + "][" + c + "]->" + array[r][c]);
			findTheLength(r + 1, c + 1, array);

		}
		if (c == array.length - 1)
			flag2 = true;
	}
}
