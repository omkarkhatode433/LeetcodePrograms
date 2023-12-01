public class Leetcode112 {
    
}
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=Integer.MAX_VALUE;
        for(int x=0;x<prices.length;x++){
            if(prices[x]<min){
                min=prices[x];
            }else if(prices[x]-min>0){
                profit+=prices[x]-min;
                min=prices[x];
                
            }
        }
        return profit;
    }
}