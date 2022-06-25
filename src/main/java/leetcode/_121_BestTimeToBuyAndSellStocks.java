package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _121_BestTimeToBuyAndSellStocks {

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] {7,6,4,3,1}));
	}

	public static int maxProfit(int[] prices) {
		int length = prices.length;
		if(prices==null || length<2)
			return 0;
		int i=1,max=0,buy=prices[0];
		for(;i<length;i++)
		{
				if(prices[i]<buy)
					buy=prices[i];
				else
					max=Math.max(prices[i]-buy, max);
			}
		return max;
	}
}