public class Solution {
    public static void main(String [] args){
        int []prices = {10,8,7,5,2};
        int result = bestTimeBuySell(prices);
        System.out.println(result);
    }

    private static int bestTimeBuySell(int[] prices) {
        int i = 0, j = 0;
        int maxP = 0;
        while(j< prices.length){
            if(prices[i]<prices[j]){
                int profit = prices[j] - prices[i];
                maxP = Math.max(maxP,profit);
            }else{
                i=j;
            }
            j++;
        }
        return maxP;
    }
}
