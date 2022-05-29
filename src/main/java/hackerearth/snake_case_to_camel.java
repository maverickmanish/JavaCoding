package hackerearth;

import java.util.Scanner;

public class snake_case_to_camel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] s=scanner.next().split("_");
		int f=0;
		String camel=null;
		
		for (String string : s) {
			if(f==0)
			{
				f=1;
				camel=string;	
				continue;
			}
			camel = camel + Character.toUpperCase(string.charAt(0))+string.substring(1);
		}
		System.out.println("camel case : "+camel);
		scanner.close();
		

	}

}
