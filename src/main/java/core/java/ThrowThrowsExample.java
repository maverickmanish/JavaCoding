package core.java;
public class ThrowThrowsExample{  
	  public double divide(int num1, int num2) throws ArithmeticException{
	double res=0.0;
	if(num2 == 0 ) {
	      throw new ArithmeticException("Denominator cannot be 0");
	}
	else{
	      res=num1/num2;
	}
	return res;  
	}
	   public static void main(String args[]){  
	    ThrowThrowsExample obj = new ThrowThrowsExample();
	    try{
	       System.out.println(obj.divide(10,0));  
	    }
	    catch(ArithmeticException e){
	       System.out.println(e.getMessage());
	       
	       System.out.println("another message :"+e );
	       
	       e.printStackTrace();
	    }
	   }  
	}