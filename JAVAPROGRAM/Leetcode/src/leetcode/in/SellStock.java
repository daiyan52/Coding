package leetcode.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SellStock {
	public static int maxProfit(int[] prices)
	{
		TreeSet<Integer> a = new TreeSet(Collections.reverseOrder());
		for(int i=0;i<prices.length;i++)
		{
			for(int j=i+1;j<prices.length;j++)
			{
				int prophit = prices[j]-prices[i];
				a.add(prophit);
			}
		}
		return a[0];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = {7,1,5,3,6,4};
		int res = maxProfit(prices);
		System.out.println(res);
		}
}
