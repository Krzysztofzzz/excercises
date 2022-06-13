package krzych.fibonacci_series;

public class Fibonacci {

    public int[] getFibonacci(int fibonacciLength) throws WrongNumberException {
        if (fibonacciLength <= 0)
            throw new WrongNumberException();
        if (fibonacciLength == 1) {
            return new int[]{0};
        }
        if (fibonacciLength == 2) {
            return new int[]{0, 1};
        }

        int[] fibonacciNumbers = new int[fibonacciLength];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i < fibonacciLength; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 2] + fibonacciNumbers[i - 1];
        }
        return fibonacciNumbers;
    }
}
