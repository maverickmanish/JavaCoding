package java8;

import java.time.Clock;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class DateTimeJava8 {
	public static void main(String[] args) {

		String banks = String.join("|", "Citibank", "Bank of America", "Chase");
		System.out.println("banks: " + banks);
		LocalDate today = LocalDate.now();
		System.out.println("Today's Local date : " + today);

		System.out.println("\n\t\t");

		LocalDate previousday = LocalDate.now();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		System.out.printf("Year : %d Month : %d day : %d \t %n", year, month, day);

		LocalDate dateOfBirth = LocalDate.of(2014, 01, 14);
		System.out.println("Your Date of birth is : " + dateOfBirth);

		LocalDate date1 = LocalDate.of(2014, 01, 14);
		if (date1.equals(dateOfBirth)) {
			System.out.printf("Today %s and date1 %s are same date %n", dateOfBirth, date1);
		}

		try {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd yyyy");
			String landing = dateOfBirth.format(format);
			System.out.printf("Arriving at : %s %n", landing);
		} catch (DateTimeException ex) {
			System.out.printf("%s can't be formatted!%n", dateOfBirth);
			ex.printStackTrace();
		}

		String goodFriday = "Apr 18 2014";
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
			LocalDate holiday = LocalDate.parse(goodFriday, formatter);
			System.out.printf("Successfully parsed String %s, date is %s%n", goodFriday, holiday);
		} catch (DateTimeParseException ex) {
			System.out.printf("%s is not parsable!%n", goodFriday);
			ex.printStackTrace();
		}

		String dayAfterTommorrow = "20140116";
		LocalDate formatted = LocalDate.parse(dayAfterTommorrow, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.printf("Date generated from String %s is %s %n", dayAfterTommorrow, formatted);

		Instant timestamp = Instant.now();
		System.out.println("What is value of this instant " + timestamp);
		System.out.println(Date.from(timestamp));
		// Returns the current time based on your system clock and set to UTC.
		Clock clock = Clock.systemUTC();
		System.out.println("Clock : " + clock);

		// Returns time based on system clock zone
		Clock defaultClock = Clock.systemDefaultZone();
		System.out.println("Clock : " + clock);

		YearMonth currentYearMonth = YearMonth.now();
		System.out.printf("Days in month year %s: %d%n", currentYearMonth, currentYearMonth.lengthOfMonth());
		YearMonth creditCardExpiry = YearMonth.of(2018, Month.FEBRUARY);
		System.out.printf("Your credit card expires on %s %n", creditCardExpiry);

		ZoneId america = ZoneId.of("Europe/Paris");
		LocalDateTime localtDateAndTime = LocalDateTime.now();
		ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localtDateAndTime, america);
		System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);

	}
}
