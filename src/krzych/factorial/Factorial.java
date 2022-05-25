package krzych.factorial;

import java.util.Scanner;

public class Factorial implements Runnable {
    @Override
    public void run() {
        while (true) {
            int number = getNumber();
            int factorial = factorialIterative(number);
            System.out.println("Factorial of " + number + " is " + factorial);
        }
    }

    private int factorialIterative(int number) {
        int factorial = 1;
        do {
            factorial *= number;
            number--;
        } while (number > 0);
        return factorial;
    }

    private int getNumber() {
        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
