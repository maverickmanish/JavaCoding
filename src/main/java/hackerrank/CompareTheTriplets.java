package hackerrank;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;

import static java.util.stream.Collectors.joining;

public class CompareTheTriplets {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		List<Integer> a = Stream.of(scanner.nextLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        List<Integer> b = Stream.of(scanner.nextLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        List<Integer> result = compareTriplets(a, b);

	        System.out.println(
	            result.stream()
	                .map(Object::toString)
	                .collect(joining(" "))
	            + "\n"
	        );
	}

	private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		Integer aa=0,bb=0;
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
			System.out.println(b.get(i));
			if(a.get(i)==b.get(i))
			{
				
			}
			else if(a.get(i)>b.get(i))
			{
				aa++;
			}
			else
			{
				bb++;
			}
			
		}
		a.clear();
	/*List<Integer> neww=	new ArrayList<Integer>(a);*/
	a.add(aa);
	a.add(bb);
	System.out.println(a);
		return a ;
	}
}
