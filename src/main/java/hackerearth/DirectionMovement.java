package hackerearth;

import java.util.Scanner;

public class DirectionMovement {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		char[] array = s.nextLine().trim().toCharArray();
		int x = 0, y = 0;
		for (char c : array) {
			if (c == 'L')
				x--;
			else if (c == 'R')
				x++;
			else if (c == 'D')
				y--;
			else if (c == 'U')
				y++;

		}
		
	}
}
