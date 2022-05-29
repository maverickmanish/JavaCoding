package hackerearth;

import java.util.Scanner;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=0;
		 Scanner s = new Scanner(System.in);
				char [] charArray=s.next().toCharArray();
				for(int i=0;i<charArray.length;i++)
				{
					if(charArray[i]=='L')
						x--;
					else if(charArray[i]=='R')
						x++;
					else if(charArray[i]=='D')
						y--;
					else if(charArray[i]=='U')
						y++;
				}
				
				System.out.println(x+" "+y);
	}

}
