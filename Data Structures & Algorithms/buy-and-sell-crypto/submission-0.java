class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i: prices){
            minPrice = Math.min(i, minPrice);
            int profit = i - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
