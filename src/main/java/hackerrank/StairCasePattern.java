package hackerrank;

public class StairCasePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 staircase(5);
			}
			 static void staircase(int n) {
				    for(int j=0;j<n;j++)
				    {
				        for(int i=0;i<n;i++)
				    {
				        if(i<n-1-j)
				            System.out.print(" ");
				        else
				            System.out.print("#");
				     
				        }
				        System.out.print("\n");
				    }

				    }
			

}
