package hackerearth;

import java.util.ArrayList;
import java.util.Scanner;

public class StringPermutation {
	static Long term = null;
	static int count = 1;
	static int temp = -1;
	static ArrayList<Long> pureNumberList= new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			term = null;
			count = 1;
			temp = -1;
			int pureth = sc.nextInt();
			int k = 1;
			while (term == null) {
				// TODO Auto-generated method stub
				permutation("45", "", k, pureth);
				k++;
			}
			System.out.println("the " + pureth + " of pure numbers is : " + term);
		}

	}

	private static String pallindromeGenerator(String ss) {
		return ss + new StringBuilder(ss).reverse().toString();
	}
	
	private static void permutation(String str, String prefix, int lengthOfPermutationString, int pureth) {
		if (prefix.length() == lengthOfPermutationString) {
			pureNumberList.add(Long.parseLong(pallindromeGenerator(prefix)));
			if (count++ == pureth) {
				
				System.out.println();
				temp = 1;
				term = Long.parseLong(pallindromeGenerator(prefix));
				
			}
		} else {

			for (int i = 0; i < str.length() && temp == -1; i++) {
				permutation(str, prefix + str.charAt(i), lengthOfPermutationString, pureth);
			}
			
			
		}
	}
}

/*
 
 

 s
https:// www.javainuse.com/spring/sprboot_sec
https:// steria-my.sharepoint.com/:x:/r/personal/manish_bhardwaj2_soprasteria_com/_layouts/15/Doc.aspx?sourcedoc={b585360d-723e-4c3e-b919-64a6c9addd77}&action=edit&activeCell=%27springBoot%27!D45&wdInitialSession=6f05f106-054f-40c3-bdab-4a321b666122&wdRldC=1
https:// www.codeproject.com/Tips/699392/Step-by-Step-your-First-journey-with-Activiti
https:// filebin.net/onfq8o1km72ltsi6
https:// www.codebyamir.com/blog/java-code-linting-with-sonarlint
https:// grokonez.com/spring-framework/spring-data/spring-boot-angular-6-example-spring-data-jpa-rest-mysql-crud-example
https:// developer.okta.com/blog/2017/12/04/basic-crud-angular-and-spring-boot
http:// 10.133.6.28:1201/#

https:// handsontable.com/docs/6.1.1/Hooks.html#event:afterContextMenuShow
https:// javabypatel.blogspot.com/2015/08/program-to-print-permutations-of-string-without-repetition.html

*/