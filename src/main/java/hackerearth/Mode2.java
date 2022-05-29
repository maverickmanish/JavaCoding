package hackerearth;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Mode2 {

	public static Integer[] mode2(int[] arr) {
		int maxFrequency = 0;
		int prevNumFrequency = 0;
		int prevNum = -1;
		HashSet<Integer> set = new HashSet<Integer>();
		Arrays.sort(arr);
		for (int j = 0; j < arr.length; j++) {
			int num = arr[j];
			if (prevNum != -1 && prevNum != num) {
				if (prevNumFrequency > maxFrequency) {
					maxFrequency = prevNumFrequency;
					set.clear();
					set.add(prevNum);
				} else if (prevNumFrequency == maxFrequency) {
					set.add(prevNum);
				}
				prevNumFrequency = 0;
			}
			prevNum = num;
			prevNumFrequency++;
		}

		if (prevNumFrequency > maxFrequency) {
			maxFrequency = prevNumFrequency;
			set.clear();
			set.add(prevNum);
		} else if (prevNumFrequency == maxFrequency) {
			set.add(prevNum);
		}

		return set.toArray(new Integer[set.size()]);
	}

	public static Integer[] mode(int[] arr) {
		Set<Integer> modes = new HashSet<>();
		int maxCount = 0;
		for (int i = 0; i < arr.length; ++i) {
			int count = 0;
			for (int j = 0; j < arr.length; ++j) {
				if (arr[j] == arr[i])
					++count;
			}
			if (count > maxCount) {
				maxCount = count;
				modes.clear();
				modes.add(arr[i]);
			} else if (count == maxCount) {
				modes.add(arr[i]);
			}
		}
		return modes.toArray(new Integer[modes.size()]);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		s.nextLine();
		for (int i = 0; i < T; i++) {

			long N = s.nextLong();
			s.nextLine();
			String[] array = s.nextLine().trim().split("\\s");
			int[] arr = new int[array.length];
			for (int j = 0; j < array.length; j++) {
				arr[j] = Integer.parseInt(array[j]);
			}
			Integer[] array2 = mode2(arr);
			Arrays.sort(array2, Collections.reverseOrder());

			for (Integer long1 : array2) {
				System.out.print(long1 + " ");
			}
			System.out.println();

		}
	}
}