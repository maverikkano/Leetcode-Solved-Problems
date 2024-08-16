class Solution {
    public int maxProfit(int[] prices) {

        int smallest = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            int price = prices[i];

            if (smallest > price) {
                smallest = price;
            } else {
                maxProfit = Math.max(maxProfit, price - smallest);
            }
        }

        return maxProfit;
    }
}