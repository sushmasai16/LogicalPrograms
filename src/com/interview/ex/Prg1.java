package com.interview.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//programs 
/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 
 
Example 1:
 
Input: prices = [70,10,50,30,60,40]
Input: prices = [10,70,50,30,60,40]



Output: 50
Explanation: Buy on day 2 (price = 10) and sell on day 5 (price = 60), profit = 60-10 = 50.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.*/
public class Prg1 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(70, 10, 50, 30, 60, 40));

		int maxProfit = maxProfit(arr);
		System.out.println("max : " + maxProfit);

	}

	public static int maxProfit(List<Integer> prices) {
		int max = 0;
		ArrayList<Integer> res = new ArrayList<>();
		System.out.println(prices);
//		for (Integer num1 : prices) {
		System.out.println("prices.size() : "+prices.size());
		for (int i = 0; i < prices.size(); i++) {

//			for (Integer integer2 : prices) {
			
			if (i != (prices.size() - 1)) {
				for (int j = i + 1; j < prices.size(); j++) {

//				int maxnu= integer2 - num1;
					System.out.println(prices.get(i) + ":" + prices.get(j));
					if (prices.get(j) > prices.get(i)) {
						int maxnu = prices.get(j) - prices.get(i);
						if (maxnu > 0) {
							res.add(maxnu);
						}
					}

				}
			}
		}
		System.out.println(res);
		max = res.get(0);
		for (Integer integer : res) {
			if (max < integer) {
				max = integer;
			}
		}

		return max;
	}
}
