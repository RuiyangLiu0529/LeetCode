public class BestTimeToBuyAndSell {
    public int maxProfit(int[] prices) {
       if(prices == null || prices.length == 0) {
           return 0;
       } 
       int min = Integer.MAX_VALUE;
       int profit = 0;
       for(int price:prices) {
           min = Math.min(min, price);
           profit = Math.max(profit, price-min);
       }
       return profit;
    }
}