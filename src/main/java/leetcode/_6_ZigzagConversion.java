package leetcode;

import java.util.HashMap;
import java.util.Map;

public class _6_ZigzagConversion {

	public static void main(String[] args) {

		System.out.println(convert("paypalishiring", 3));
		
	}
	/*
	 * Interval indicates the distance between two vertical columns.
	 * 
	 * Step indicates the distance between middle characters and vertical columns.
	 * 
	 * Interval is 2n – 2 where n is the input number of rows and step is interval –
	 * 2i where i is the index of the row.
	 * Time Complexity:O(n), where n ==len(s). Each index is visited once.
	 * Space Complexity: O(n)
	 */
	
public static String convert(String s, int n) {
	int length=s.length();
	 if (n > length || n == 1) {
         return s;
     }
	
	int interval=2*n-2;
	 StringBuilder r = new StringBuilder();
		
		for(int i=0;i<n;i++)
		{
			int step=interval -2*i;
			
			for(int j=i;j<length;j+=interval)
			{
				r.append(s.charAt(j));;
				
				if(step>0 && step <interval && j+step<length)
					r.append(s.charAt(step+j));
			}
			
		}
		return r.toString();
    }

public static String convert2(String s, int numRows) {
    Map<Integer,StringBuilder> map= new HashMap<>();
    int pos=0;
    boolean incr=true;
    for(char c:s.toCharArray())
    {
        if(pos==numRows)
        {
            incr=false;
        }
        if(pos==1)
        {
            incr=true;
        }
        if(incr){
            pos++;
        }else
        {
            pos--;
        }
        if(!map.containsKey(pos))
        {
            map.put(pos,new StringBuilder());
        }
        map.get(pos).append(c);
    }
    StringBuilder res = new StringBuilder();
    for(int i:map.keySet())
    {
        res.append(map.get(i));
    }
    return res.toString();
}
}
