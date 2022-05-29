package java8;

import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;


public class Hours12_24 {

	public static void main(String[] args) {
		 
		
		/* String input = "10:22:12PM";
	      //Format of the date defined in the input String
	      DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
	      //Desired format: 24 hour format: Change the pattern as per the need
	      DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
	      Date date = null;
	      String output = null;
	      try{
	         //Converting the input String to Date
	    	 date= df.parse(input);
	         //Changing the format of date and storing it in String
	    	 output = outputformat.format(date);
	         //Displaying the date
	    	 System.out.println(output);
	      }catch(ParseException pe){
	         pe.printStackTrace();
	       }*/
		
	
	      
	      String _12HourFormat = "10:22:12PM";
	      timeConversion(_12HourFormat);
	
	}

	private static void timeConversion(String _12HourFormat) {
		LocalTime time=null;
			try {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ssa");
				time = LocalTime.parse(_12HourFormat, formatter);
				System.out.printf("Successfully parsed String %s, date is %s\n",_12HourFormat, time);
			} catch (DateTimeParseException ex) {
				System.out.printf("%s is not parsable!%n", _12HourFormat);
				ex.printStackTrace();
			}
			
			
			try {
				DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
				String _24HourFormat = time.format(format);
				System.out.printf("finally, 24 hours format string : %s \n", _24HourFormat);
			} catch (DateTimeException ex) {
				System.out.printf("%s can't be formatted!\n", time);
				ex.printStackTrace();
			}
	}
}
