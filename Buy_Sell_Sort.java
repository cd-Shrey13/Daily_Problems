public class Buy_Sell_Sort {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int currentProfit = 0;
        int minimumValue = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            int currentPriceFromPrices = prices[i];
            minimumValue = Math.min(minimumValue, currentPriceFromPrices);
            currentProfit = currentPriceFromPrices - minimumValue;
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;

    }
}
