package udemy.in28minutes;

public class stiboSystems {

public static boolean armStrongNumber(long N)
{   
	long sum =0, Number =N, lenN=N;
	int len=0;
	while(lenN>0)
	{len++;
	lenN/=10;
	}
	
	while(N>0)
	{   long d = N%10;
		sum += Math.pow(d,len);
		N/=10;
	
	}
	return (sum==Number);
}
	
	public static void main(String[] args) {
		starPrint();
		
		System.out.println(armStrongNumber(105));
		
	for(int i=1;i<=10;i++)
	{
		System.out.print(fibonacci(i)+", ");
	}
	}

	public static long fibonacci(int n)
	{
		
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		else 
			return fibonacci(n-1)+fibonacci(n-2);
	}
	
	public static void starPrint()
	{
		for(int i=4;i>=0;i--)
		{ 
			for(int j=0;j<5;j++)
			{  if(j<i)
				System.out.print(" ");
			else 
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
