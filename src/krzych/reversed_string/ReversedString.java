package krzych.reversed_string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReversedString implements Runnable {
    @Override
    public void run() {
        while (true) {
            String stringToReverse = getString();
            int stringLength = stringToReverse.length();
            String newString = "";
            for (int i = 0; i < stringLength; i++) {
                newString += stringToReverse.charAt(stringLength - i - 1);
            }
            System.out.println("Reversed string:\n" + newString);
        }
    }

    private String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String and I will reverse it:");
        return scanner.nextLine();
    }
}
