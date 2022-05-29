package udemy.in28minutes;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Java8NewDateAPI {

	public static void main(String[] args) {
		/*
		 * CharSequence text = "21:34:45"; DateTimeFormatter formatter =
		 * DateTimeFormatter.ofPattern("HH:mm:ss"); LocalTime dateTime2 =
		 * LocalTime.parse(text, formatter);
		 * 
		 * LocalDateTime dateTime = LocalDateTime.now();
		 * System.out.println(dateTime.format(formatter));
		 */

		/*
		 * Instant now = Instant.now();
		 * 
		 * // convert Instant to ZonedDateTime DateTimeFormatter dtfDateTime =
		 * DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss",Locale.US); ZonedDateTime
		 * zonedDateTime = ZonedDateTime.ofInstant(now, ZoneId.systemDefault());
		 * System.out.println(dtfDateTime.format(zonedDateTime));
		 */
		
		/*
		 * System.out.println("--- Examples --- ");
		 * 
		 * Duration oneHours = Duration.ofHours(1);
		 * System.out.println(oneHours.getSeconds() + " seconds");
		 * 
		 * Duration oneHours2 = Duration.of(1, ChronoUnit.HOURS);
		 * System.out.println(oneHours2.getSeconds() + " seconds");
		 * 
		 * // Test Duration.between System.out.println("\n--- Duration.between --- ");
		 * 
		 * LocalDateTime oldDate = LocalDateTime.of(2016, Month.AUGUST, 31, 10, 20, 55);
		 * LocalDateTime newDate = LocalDateTime.of(2016, Month.NOVEMBER, 9, 10, 21,
		 * 56);
		 * 
		 * System.out.println(oldDate); System.out.println(newDate);
		 * 
		 * //count seconds between dates Duration duration = Duration.between(oldDate,
		 * newDate);
		 * 
		 * System.out.println(duration.getSeconds() + " seconds");
		 */
		

      String dateInString = "22-1-2015 10:15:55 AM";
		
      String DATE_FORMAT = "dd-M-yyyy hh:mm:ss a";
      DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_FORMAT);
        LocalDateTime ldt = LocalDateTime.parse(dateInString,
        		format);

        ZoneId singaporeZoneId = ZoneId.of("Asia/Singapore");
        System.out.println("TimeZone : " + singaporeZoneId);

        //LocalDateTime + ZoneId = ZonedDateTime
        ZonedDateTime asiaZonedDateTime = ldt.atZone(singaporeZoneId);
        System.out.println("Date (Singapore) : " + asiaZonedDateTime);

        ZoneId newYokZoneId = ZoneId.of("America/New_York");
        System.out.println("TimeZone : " + newYokZoneId);

        ZonedDateTime nyDateTime = asiaZonedDateTime.withZoneSameInstant(newYokZoneId);
        System.out.println("Date (New York) : " + nyDateTime);

        System.out.println("\n---DateTimeFormatter---");
        System.out.println("Date (Singapore) : " + format.format(asiaZonedDateTime));
        System.out.println("Date (New York) : " + format.format(nyDateTime));

	}
}
