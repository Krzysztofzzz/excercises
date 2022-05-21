package krzych.prime_number;

import java.util.Scanner;

public class PrimeNumber implements Runnable {

    @Override
    public void run() {
        while (true) {
            int numberToCheck = getNumber();
            int halfNumberToCheck = numberToCheck / 2;
            int flag = 0;

            for (int i = 2; i <= halfNumberToCheck; i++) {
                if (numberToCheck % i == 0) {
                    System.out.println("Number: " + numberToCheck + " is not a prime...");
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                continue;
            System.out.println("Number: " + numberToCheck + " Is a prime!!!");

        }
    }

    private int getNumber() {
        System.out.println("Enter a number and I will check if it is a prime number");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
