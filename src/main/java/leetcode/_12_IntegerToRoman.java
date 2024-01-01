package leetcode;

public class _12_IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToRoman(3));
	}
	
	 public static String intToRoman(int num) {
		 StringBuilder s=new StringBuilder();
		 num = getNum(num, s, 1000, 'M', "CM", 900);
		 num = getNum(num, s, 500, 'D', "CD", 400);
		 num = getNum(num, s, 100, 'C', "XC", 90);
		 num = getNum(num, s, 50, 'L', "XL", 40);
		 num = getNum(num, s, 10, 'X', "IX", 9);
		 num = getNum(num, s, 5, 'V', "IV", 4);
/*
		 if(num/500>0) {concat(s, 'D',num/500); num%=500;  }
			 if(num%500>=400) { concat(s,"CD"); num-=400;}
			 
			 if(num/100>0) {concat(s, 'C',num/100); num%=100;  }
			 if(num%100>=90) { concat(s,"XC"); num-=90;}
			 
			 if(num/50>0) {concat(s, 'L',num/50); num%=50;  }
			 if(num%50>=40) { concat(s,"XL"); num-=40;}
			 
			 if(num/10>0) {concat(s, 'X',num/10); num%=10;  }
			 if(num%10>=9) { concat(s,"IX"); num-=9;}
			 
			 if(num/5>0) {concat(s, 'V',num/5); num%=5;  }
			 if(num%5>=4) { concat(s,"IV"); num-=4;}
			*/
		concat(s, 'I', num);
		 return s.toString();
	    }

	private static int getNum(int num, StringBuilder s, int value, char romanChar, String combinedPredecessor, int predecessorValue) {
		if(num / value >0) {concat(s, romanChar, num / value); num %= value;  }
		if(num %1000>= predecessorValue) { concat(s,combinedPredecessor); num -=predecessorValue;}
		return num;
	}

	private static void concat(StringBuilder s, String string) {
		 s.append(string);
	}

	public static void concat(StringBuilder s, char c, int n) {
		while (n-- > 0) {
			s.append(c);
		}
	}

	 
}



