package hackerearth;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HorseMatch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int T = s.nextInt();
		for (int i = 0; i < T; i++) {
			s.nextLine();
			int N = s.nextInt();
			Integer array[] = new Integer[N];
			s.nextLine();
			for (int k = 0; k < N; k++) {
				array[k] = s.nextInt();
			}

			s.nextLine();
			int Sum = s.nextInt();
			System.out.println(sumPossible(array, Sum, 0, N) ? "YES" : "NO");

		}

	}

	private static boolean sumPossible(Integer[] array, int sum, int tillNow, int n) {
		if(sum==tillNow)
			return true;
		if(n<1)
			return false;
		return sumPossible(array, sum, tillNow+array[n-1], n-1) || sumPossible(array, sum, tillNow, n-1) ;
		
			
	}
}
