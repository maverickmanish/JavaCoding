public class SIB1 {
   
    static {
        System.out.println("SIB");
    }
    public SIB1() {
        System.out.println("Constructor");
    }
   
    public static void main(String[] args) {
    	 
    	 try{int data=50;//may throw exception
    	 }
    	 catch (ArithmeticException e) {
    		 e.printStackTrace();
			System.out.println("sdfsfd");
		}
    	 SIB1 s= new SIB1();
	      System.out.println("rest of the code...");  
    	System.out.println("It's SIb");
    }
    
}