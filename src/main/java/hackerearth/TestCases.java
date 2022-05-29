package hackerearth;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[]) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        Integer testCases = s.nextInt();
        s.nextLine();
        
        for(int i=0;i<testCases;i++)
        {
            double N= s.nextDouble();
            double M = s.nextDouble();
            if(N==M)
             System.out.println("YES");
             else
              {
                  if(N==2 && M==4 || N==4 && M==2 )
                	  System.out.println("YES");
                  else
                	  System.out.println("NO");
              }
            
        }
        
        

        
        
   
    }
    
   
}
