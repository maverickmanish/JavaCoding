public class SIB1 {
   
	{
		System.out.println("IIB");
	}
    static {
        System.out.println("SIB");
    }
    public SIB1() {
        System.out.println("Constructor");
    }
    
    public SIB1(int a)
    {
    	System.out.println("Constructir : value of a "+ a);
    }
   
    public static void main(String[] args) {
    	 
    	 try{int data=50;//may throw exception
    	 }
    	 catch (ArithmeticException e) {
    		 e.printStackTrace();
			System.out.println("sdfsfd");
		}
    	 new SIB1();
    	 new SIB1(7);
	      System.out.println("rest of the code...");  
    	System.out.println("It's SIb");
    }
    
}