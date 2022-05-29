package hackerearth;

import java.util.Scanner;

public class LoveProblem {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		char[] ss = s.nextLine().trim().toCharArray();
		boolean flagL =false,flagO=false ,flagV=false ,flagE=false;
		for (char c : ss) {
			if( !flagL && (c=='L' || c=='l')  )
				flagL=true;
			else if(flagL  && !flagO && (c=='O' || c=='o')  )
				flagO=true;
			else if(flagL && flagO  && !flagV && (c=='V' || c=='v')  )
				flagV=true;
			else if(flagL && flagO  && flagV && !flagE && (c=='E' || c=='e')  )
				flagE=true;
			else if(flagL && flagO  && flagV && flagE)
				break;
			}
		if(flagL && flagO  && flagV && flagE)
			System.out.println("I love you, too!");
		else
			System.out.println("Let us breakup!");
		
		}

}
