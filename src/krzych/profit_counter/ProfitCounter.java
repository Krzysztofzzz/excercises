package krzych.profit_counter;

public class ProfitCounter {

    public int findBiggestProfit(int[] input) {
        if (input == null || input.length == 0 || input.length == 1)
            return -1;
        int profit = -1;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                int newProfit = input[j] - input[i];
                if (newProfit > profit && newProfit > 0)
                    profit = newProfit;
            }
        }
        return profit;
    }
}
