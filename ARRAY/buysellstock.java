public class buysellstock {
    public static int buysell(int prices[]) {
        int buyprices = Integer.MAX_VALUE; // -infinity
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprices < prices[i]) {
                // prices[i] means selling prices
                int profit = prices[i] - buyprices; // today profit
                maxProfit = Math.max(maxProfit, profit);

            } else {
                buyprices = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buysell(prices));
    }
}
