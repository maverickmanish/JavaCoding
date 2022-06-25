package leetcode;

public class _14_LongestCommonPrefix {

	public static void main(String[] args) {
		  

	}
	public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1)
        	return strs[0];
        String sub=strs[0];
        for (int i=1,j,k;i<strs.length;i++) {
			j=k=0;
			String st = strs[i];
        	while(j<sub.length() && k< st.length() && sub.charAt(j++)==st.charAt(k))
        	{k++;}
        	sub=st.substring(0,k);
        		
		}
        return sub;
    }
}
