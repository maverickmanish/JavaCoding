package hackerearth;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class PseudoEqual {
 
	public static long p[][] = new long[201][50001];
	public static final int mod = 1000000007;
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		for (int i = 0; i < p.length; i++) {
			Arrays.fill(p[i], -1);
		}
 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
 
		long v[] = new long[81 * n + 1];
		long count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= 81 * n; j++)
				v[j] = (v[j] + finalCount(i, j)) % mod;
		}
		for (int j = 0; j <= 81 * n; j++) {
			count = (count + ((v[j] % mod) * ((v[j] - 1) % mod)) + (v[j] % mod)) % mod;
		}
		System.out.println(count + 1 + 2 * n + 1);
	}
 
	public static long countRec(int n, int sum) {
		if (n == 0)
			return ((sum == 0) ? 1 : 0);
		if (p[n][sum] != -1)
			return p[n][sum];
 
		long ans = 0;
		for (int i = 0; i < 10; i++)
			if (sum - i * i >= 0)
				ans = (ans + countRec(n - 1, sum - i * i)) % mod;
		return p[n][sum] = ans % mod;
	}
 
	public static long finalCount(int n, int sum) {
		long ans = 0;
		for (int i = 1; i <= 9; i++)
			if (sum - i * i >= 0)
				ans = (ans + countRec(n - 1, sum - i * i)) % mod;
		return ans;
	}
}