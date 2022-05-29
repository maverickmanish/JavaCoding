package hackerearth;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class First {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<T;i++)
		{
			int N= scanner.nextInt();
			int K= scanner.nextInt();
			scanner.nextLine();
			Integer[] array= Stream.of(scanner.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
			
			Arrays.sort(array,Collections.reverseOrder());
			long sum=Arrays.stream(array).reduce(0, (a,b)->a+b);
			if(Math.floor(sum/N) > K)
				System.out.println((sum/(K+1))+1-N);
			else
				System.out.println(0);
				
		}
	}
}
