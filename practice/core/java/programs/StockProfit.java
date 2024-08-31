package practice.core.java.programs;

/**
 * Given an array prices[] of size N denoting the cost of stock on each day, the task is to find the maximum total profit if we can buy and sell the stocks any number of times.
 */
public class StockProfit {
    public static void main(String[] args) {
        //int[] prices = {100, 180, 260, 310, 40, 535, 695};
        //int[] prices =  {1,2,4,1};

        int[] prices =  {3,1,4,8,7,2,5};
        Integer totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }

        System.out.println("Max Profit "+totalProfit);
    }
}
