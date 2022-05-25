package krzych.factorial;

import java.util.Scanner;

public class Factorial implements Runnable {
    @Override
    public void run() {
        while (true) {
            int number = getNumber();
            //int factorial = factorialIterative(number);
            int factorial = factorialRecursive(number);
            System.out.println("Factorial of " + number + " is " + factorial);
        }
    }

    private int factorialRecursive(int number) {
        if (number > 0)
            return number * factorialRecursive(number - 1);
        else return 1;
    }

    private int factorialIterative(int number) {
        int factorial = 1;
        while (number > 0) {
            factorial *= number;
            number--;
        }
        return factorial;
    }

    private int getNumber() {
        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
