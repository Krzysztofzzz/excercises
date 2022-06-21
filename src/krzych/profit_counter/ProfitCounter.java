package krzych.profit_counter;

public class ProfitCounter {

    public int findBiggestProfit(int[] input) {
        if (input == null || input.length == 0 || input.length == 1)
            return -1;
        int profit = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] - input[i] > profit)
                    profit = input[j] - input[i];
            }
        }
        return profit;
    }
}
