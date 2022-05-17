package krzych.fibonacci_series;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci implements Runnable {
    @Override
    public void run() {
        while (true) {
            int fibonnaciLength = scanLength();
            if (fibonnaciLength <= 0) {
                System.out.println("Enter positive number");
                continue;
            }
            if (fibonnaciLength == 1) {
                System.out.println("0");
                continue;
            }
            if (fibonnaciLength == 2) {
                System.out.println("[0 , 1]");
                continue;
            }

            int[] fibonacciNumbers = new int[fibonnaciLength];
            fibonacciNumbers[0] = 0;
            fibonacciNumbers[1] = 1;
            for (int i = 2; i < fibonnaciLength; i++) {
                fibonacciNumbers[i] = fibonacciNumbers[i - 2] + fibonacciNumbers[i - 1];
            }
            System.out.println(Arrays.toString(fibonacciNumbers));
        }
    }

    private int scanLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fibonacci's length:");
        return scanner.nextInt();
    }
}
