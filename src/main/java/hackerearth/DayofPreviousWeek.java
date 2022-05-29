package hackerearth;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayofPreviousWeek {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for (int i = 0; i < T; i++) {
			s.nextLine();
			int day = s.nextInt();
			Month month = Month.valueOf(s.next().toUpperCase());
			int year = s.nextInt();

			LocalDate localDate = LocalDate.of(year, month, day);

			localDate = localDate.minusDays(1);
			DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("d MMMM yyyy");
			System.out.println(localDate.format(FOMATTER));
		}

	}
}
