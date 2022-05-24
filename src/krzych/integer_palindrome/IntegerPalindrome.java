package krzych.integer_palindrome;

import java.util.Scanner;

public class IntegerPalindrome implements Runnable {
    @Override
    public void run() {
        while (true) {
            int intToCheck = getInteger();
            int intNumberOfDigits = getNumberOfDigits(intToCheck);
            int reversedInt = 0;
            int temp = intToCheck;
            for (int decimal = intNumberOfDigits - 1; temp > 0; decimal--){
                reversedInt += (temp%10)*Math.pow(10,decimal);
                temp /= 10;
            }
            if (intToCheck == reversedInt)
                System.out.println("The given number is a palindrome :)");
            else
                System.out.println("The given number is not a palindrome :(");
        }
    }

    private int getNumberOfDigits(int intToCheck) {
        int intNumberOfDigits = 0;
        for (int i = 0; intToCheck > 0; i++) {
            intNumberOfDigits++;
            intToCheck /= 10;
        }
        return intNumberOfDigits;
    }

    private int getInteger() {
        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
