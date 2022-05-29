package hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class MininmumAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Integer energy = scanner.nextInt();
		scanner.nextLine();
		Integer[] count = new Integer[3];
		Integer[] cost = new Integer[3];
		Integer[] cost2 = new Integer[3];
		Integer[] energyT = { 2, 3, 5 };
		for (int i = 0; i < 3; i++)
			count[i] = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < 3; i++) {
			cost[i] = scanner.nextInt();
			cost2[i] = cost[i];
		}
		Arrays.sort(cost2);
		Integer max = cost2[0];
		Integer min = cost2[cost2.length - 1];
		int totalEnergy = 0;
		for (int i = 0; i < 3; i++) {

			while (totalEnergy != energy) {
				
				
			}

		}

	}

}
