public class bestTimeToBuyAndSellStock {
    public static int buyAndSellStocks(int[] prices){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            int sellingPrice = prices[i];

            if(buyPrice < sellingPrice){
                int profit = sellingPrice - buyPrice;//today's profite
                maxProfit = Math.max(maxProfit, profit);
            }
            else{//if buyPrice < selling price
                buyPrice = sellingPrice;// Update buyPrice when we find a lower price
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));
    }
}
