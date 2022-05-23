package krzych.string_palindrome;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome implements Runnable {
    @Override
    public void run() {
        //palindromeWithLibraries();
        palindromeIterative();
    }

    private void palindromeIterative() {
        while (true) {
            String text = getString();
            char[] textChars = text.toCharArray();
            char[] reverseTextChar = new char[text.length()];
            int start = 0;
            for (int i = textChars.length; i > 0; i--) {
                reverseTextChar[start] = textChars[i - 1];
                start ++;
            }
            if (Arrays.equals(textChars, reverseTextChar))
                System.out.println(text + " is a palindrome!!!");
            else
                System.out.println(text + " is not a palindrome...");
        }
    }

    private void palindromeWithLibraries() {
        while (true) {
            String text = getString();
            StringBuilder stringBuilder = new StringBuilder(text);
            stringBuilder.reverse();
            if (text.equals(stringBuilder.toString()))
                System.out.println(text + " is a palindrome!!!");
            else
                System.out.println(text + " is not a palindrome...");
        }
    }

    private String getString() {
        System.out.println("Enter text to check if it is a palindrome");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
