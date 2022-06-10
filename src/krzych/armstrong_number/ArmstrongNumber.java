package krzych.armstrong_number;

import java.util.Scanner;

public class ArmstrongNumber{

    public boolean isArmstrong(int numberToCheck) {
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
