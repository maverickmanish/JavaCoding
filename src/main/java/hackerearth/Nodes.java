package hackerearth;

import java.math.BigInteger;
import java.util.Scanner;

public class Nodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			sc.nextLine();
			int k = sc.nextInt();
			int H = sc.nextInt();

			BigInteger res=new BigInteger(String.valueOf(k));
            res=res.pow(H+1);
            res=res.subtract(new BigInteger("1"));
            res=res.divide(new BigInteger(String.valueOf(k-1)));
            
            BigInteger ans=new BigInteger("0");
            while(res.compareTo(BigInteger.ZERO) > 0)
            {
                BigInteger rem=res.mod(new BigInteger("10"));
                ans=ans.add(rem);
                res=res.divide(new BigInteger("10"));
            }
            System.out.println(ans);
		}
	}

}
