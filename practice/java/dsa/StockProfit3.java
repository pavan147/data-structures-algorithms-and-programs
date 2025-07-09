package practice.java.dsa;

/**
 * Problem Explanation
 * You are given an array prices[] where prices[i] represents the stock price on the ith day. Your goal is to find the maximum profit you can achieve by:
 * <p>
 * Buying on one day and
 * Selling on a different future day (i.e., a day after the buy).
 * If no profit can be made (i.e., prices never go up after buying), return 0.
 * <p>
 * Key Observations
 * To maximize profit:
 * We want the buy price to be the lowest price seen so far in the array.
 * We want the sell price to be the highest price after that lowest point.
 * Profit = Sell Price - Buy Price.
 * We need to ensure that:
 * The buy day always occurs before the sell day, i.e., buy price and sell price are not swapped.
 * For example:
 * <p>
 * prices = [7, 1, 5, 3, 6, 4]
 * Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
 * prices = [7, 6, 4, 3, 1]
 * No profit is possible (the stock prices only decrease).
 */
public class StockProfit3 {

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + maxProfit(prices1)); //
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                //getting min price
                minPrice = price;

            } else {
                // if price is greater than min price then checking profit.
                int profit = price - minPrice;
                //comparing max profit vs profit
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}
