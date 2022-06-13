package krzych.string_palindrome;

import java.util.Arrays;

public class StringPalindrome {

    public boolean palindromeIterative(String text) {
        char[] textChars = text.toCharArray();
        char[] reverseTextChar = new char[text.length()];
        int start = 0;
        for (int i = textChars.length; i > 0; i--) {
            reverseTextChar[start] = textChars[i - 1];
            start++;
        }
        return Arrays.equals(textChars,reverseTextChar);
    }

    public boolean palindromeWithLibraries(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();
        return text.equals(stringBuilder.toString());
    }
}
