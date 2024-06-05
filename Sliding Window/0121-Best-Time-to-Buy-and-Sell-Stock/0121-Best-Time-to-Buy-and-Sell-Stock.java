class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;

        int profit = 0;
        while ( right < prices.length){
            if(prices[left] < prices[right]){
                int currProfit = prices[right] - prices[left];
                profit = Math.max(currProfit, profit);
            }else{
                left = right;    
            }
            right += 1;
        }
        return profit;
    }
}