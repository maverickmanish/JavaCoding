package exceptionhandling;

public class Handling1 {

	public static void main(String[] args) {
		   int dividend = 8;
		    int divisor = 0;
		    float result = 0;
		   
		        try {
		            result = dividend/divisor;
		            System.out.println("Result is " +result);
		        } catch (Exception e) {
		            System.out.println("Can not perform division as Divisor is Zero");
		        }
		       
		        System.out.println("End of Program");
		       
		       }
		    }