package leetcode;

public class _12_IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToRoman(3));
	}
	
	 public static String intToRoman(int num) {
		 StringBuilder s=new StringBuilder();

			 if(num/1000>0) {concat(s, 'M',num/1000); num%=1000;  }
			 if(num%1000>=900) { concat(s,"CM",1); num-=900;}
			 
			 if(num/500>0) {concat(s, 'D',num/500); num%=500;  }
			 if(num%500>=400) { concat(s,"CD",1); num-=400;}
			 
			 if(num/100>0) {concat(s, 'C',num/100); num%=100;  }
			 if(num%100>=90) { concat(s,"XC",1); num-=90;}
			 
			 if(num/50>0) {concat(s, 'L',num/50); num%=50;  }
			 if(num%50>=40) { concat(s,"XL",1); num-=40;}
			 
			 if(num/10>0) {concat(s, 'X',num/10); num%=10;  }
			 if(num%10>=9) { concat(s,"IX",1); num-=9;}
			 
			 if(num/5>0) {concat(s, 'V',num/5); num%=5;  }
			 if(num%5>=4) { concat(s,"IV",1); num-=4;}
			 
			 concat(s, 'I', num);

		 return s.toString();
	    }

	 private static void concat(StringBuilder s, String string, int n) {
		 s.append(string);
		
	}

	public static void concat(StringBuilder s,char c,int n)
	 {    while(n-->0)
	      s.append(c);
	 }

	 
}



