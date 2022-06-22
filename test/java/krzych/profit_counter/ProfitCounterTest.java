package krzych.profit_counter;

import org.junit.Assert;
import org.junit.Test;

public class ProfitCounterTest {

    private final ProfitCounter profitCounter = new ProfitCounter();

    @Test
    public void whenInputIsNullReturnMinusOne() {
        int[] input = null;
        int output = profitCounter.findBiggestProfit(input);
        int expected = -1;
        Assert.assertEquals(expected, output);
    }

    @Test
    public void whenInputIsEmptyReturnMinusOne() {
        int[] input = {};
        int output = profitCounter.findBiggestProfit(input);
        int expected = -1;
        Assert.assertEquals(expected, output);
    }

    @Test
    public void whenInputIsOneNumberReturnMinusOne() {
        int[] input = {2};
        int output = profitCounter.findBiggestProfit(input);
        int expected = -1;
        Assert.assertEquals(expected, output);
    }

    @Test
    public void whenThereIsNoProfitReturnZero() {
        int[] input = {5, 5, 5, 5, 5, 5, 5, 5};
        int output = profitCounter.findBiggestProfit(input);
        int expected = -1;
        Assert.assertEquals(expected, output);
    }

    @Test
    public void whenInputIsTwoNumbersReturnTheirDifference() {
        int[] input = {1, 2};
        int output = profitCounter.findBiggestProfit(input);
        int expected = 1;
        Assert.assertEquals(expected, output);
    }

    @Test
    public void whenInputIsMultipleNumbersReturnBiggestDifference() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int output = profitCounter.findBiggestProfit(input);
        int expected = 8;
        Assert.assertEquals(expected, output);
    }

    @Test
    public void whenInputIsMultipleNumbersReturnBiggestDifference2() {
        int[] input = {6, 2, 9, 1, 5, 6, 16, 8, 2};
        int output = profitCounter.findBiggestProfit(input);
        int expected = 15;
        Assert.assertEquals(expected, output);
    }

    @Test
    public void whenInputIsMultipleNumbersDescendingReturnBiggestDifference() {
        int[] input = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int output = profitCounter.findBiggestProfit(input);
        int expected = -1;
        Assert.assertEquals(expected, output);
    }
}