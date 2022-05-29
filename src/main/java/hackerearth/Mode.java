package hackerearth;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

public class Mode {

	

	public static Long[] mode(long a[]) {
		Set<Long> modes = new HashSet<Long>();
		int maxCount = 0;
		for (int i = 0; i < a.length; ++i) {
			int count = 0;
			for (int j = 0; j < a.length; ++j) {
				if (a[j] == a[i])
					++count;
			}
			if (count > maxCount) {
				maxCount = count;
				modes.clear();
				modes.add(a[i]);
			} else if (count == maxCount) {
				modes.add(a[i]);
			}
		}
		return modes.toArray(new Long[modes.size()]);
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();

		for (int i = 0; i < T; i++) {
			s.nextLine();
			long N = s.nextLong();
			s.nextLine();
			long array[] = new long[(int) N];
			for (int k = 0; k < N; k++) {
			array[k] = s.nextLong();
			
			}
			Long[] array2=mode(array);
			Arrays.sort(mode(array), Collections.reverseOrder());
			
			for (Long long1 : array2) {
System.out.print(long1+" ");
			}
			System.out.println();
			
	}
}
}