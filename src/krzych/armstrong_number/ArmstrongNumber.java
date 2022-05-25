package krzych.armstrong_number;

import java.util.Scanner;

public class ArmstrongNumber implements Runnable {
    @Override
    public void run() {
        while (true) {
            int number = getNumber();
            if (isArmstrong(number))
                System.out.println("Given number is an Armstrong number!!!!");
            else System.out.println("Given number is not an Armstrong number ...");

        }
    }

    private boolean isArmstrong(int numberToCheck) {
        int temp = numberToCheck;
        int sum = 0;
        while (temp > 0) {
            sum += Math.pow((temp % 10), 3);
            temp /= 10;
        }
        return sum == numberToCheck;
    }

    private int getNumber() {
        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
