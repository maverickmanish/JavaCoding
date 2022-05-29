package hackerearth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		Map<Long, Integer> map = new HashMap<>();
		for (int i = 0; i < T; i++) {
			scanner.nextLine();
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			int N = scanner.nextInt();
			int MOD = scanner.nextInt();
			System.out.println(forceCalculation(a, b, N, MOD, map));

		}
	}

	public static long forceCalculation(long a, long b, int N, int MOD, Map<Long, Integer> map) {
		long force = 0;
		map.clear();
		map.put(a, 1);
		if (map.containsKey(b))
			map.put(b, map.get(b) + 1);
		else
			map.put(b, 1);

		int i = 2;
		while (i < N) {
			long c = (a + b) % MOD;

			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
			a = b;
			b = c;
			i++;
		}

		for (Long key : map.keySet()) {
			force += Math.pow(map.get(key), 2);
		}
		return force;
	}
}
