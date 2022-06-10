package krzych.armstrong_number;

public class ArmstrongNumber {

    boolean isArmstrong(int numberToCheck) {
        int temp = numberToCheck;
        int sum = 0;
        while (temp > 0) {
            sum += Math.pow((temp % 10), 3);
            temp /= 10;
        }
        return sum == numberToCheck;
    }
}
