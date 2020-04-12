package Arrays;

public class StockBuyAndSellProblem {

    public static int maxProfit(int []prices, int start, int end){

        if(end<=start){
            return 0;
        }
        int profit=0;
        for(int i=start;i<end ;i++){
            for(int j=i+1;j<=end ;j++){
                if(prices[j] > prices[i]){
                   int curr_profit =  prices[j] -prices[i]
                           + maxProfit(prices,start, i-1)
                            + maxProfit(prices,j+1,end);
                   profit = Math.max(profit,curr_profit);
                }
            }
        }
        return profit;

    }

    public static int maxprofitOptimisedSolution(int []prices){
        int profit = 0 ;
        for(int i=1;i < prices.length;i++){
            if(prices[i] > prices[i-1]){
                profit += (prices[i] - prices[i-1]);
            }
        }
        return profit;
    }
    public static void main(String []args){
             int []prices = new int[]{2,5,3,8,12};
             int profit = maxProfit(prices,0,prices.length-1);
             System.out.println(profit);

             int profit2 = maxprofitOptimisedSolution(prices);
            System.out.println(profit2);

    }
}
