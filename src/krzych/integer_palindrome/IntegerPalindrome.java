package krzych.integer_palindrome;

public class IntegerPalindrome {

    boolean isIntegerPalindrome(int intToCheck) {
        int intNumberOfDigits = getNumberOfDigits(intToCheck);
        int reversedInt = 0;
        int temp = intToCheck;
        for (int decimal = intNumberOfDigits - 1; temp > 0; decimal--) {
            reversedInt += (temp % 10) * Math.pow(10, decimal);
            temp /= 10;
        }
        return intToCheck == reversedInt;
    }

    private int getNumberOfDigits(int intToCheck) {
        int intNumberOfDigits = 0;
        for (int i = 0; intToCheck > 0; i++) {
            intNumberOfDigits++;
            intToCheck /= 10;
        }
        return intNumberOfDigits;
    }
}
