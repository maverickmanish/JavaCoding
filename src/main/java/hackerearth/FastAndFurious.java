package hackerearth;

import java.util.Scanner;
import java.util.stream.Stream;

public class FastAndFurious {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int NoOfcheckPoints = sc.nextInt();
		sc.nextLine();
		/*Long[] Brian = new Long[NoOfcheckPoints];
		Long[] Dom = new Long[NoOfcheckPoints];
		for(int i=0;i<NoOfcheckPoints;i++)
		{
			Dom[i]=sc.nextLong();
		}
		sc.nextLine();
		for(int i=0;i<NoOfcheckPoints;i++)
		{
			Brian[i]=sc.nextLong();
		}*/
		
		
		Long[] Dom =  Stream.of(sc.nextLine().trim().split(" ")).map(Long::parseLong).toArray(Long[]::new);
		Long[] Brian =  Stream.of(sc.nextLine().trim().split(" ")).map(Long::parseLong).toArray(Long[]::new);
		long maxChangeDOM = 0, maxChangeBRIAN = 0;
		for (int i = 1; i < NoOfcheckPoints; i++) {
			if (maxChangeDOM < Math.abs(Dom[i] - Dom[i - 1]))
				maxChangeDOM = Math.abs(Dom[i] - Dom[i - 1]);
			if (maxChangeBRIAN < Math.abs(Brian[i] - Brian[i - 1]))
				maxChangeBRIAN = Math.abs(Brian[i] - Brian[i - 1]);
		}
		if (maxChangeDOM == maxChangeBRIAN) {
			System.out.println("Tie");
			System.out.println(maxChangeDOM);
		}
		if (maxChangeDOM < maxChangeBRIAN) {
			System.out.println("Brian");
			System.out.println(maxChangeBRIAN);
		} else {
			System.out.println("Dom");
			System.out.println(maxChangeDOM);
		}
	}
}
