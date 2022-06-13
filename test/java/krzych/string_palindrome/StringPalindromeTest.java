package krzych.string_palindrome;

import org.junit.Assert;
import org.junit.Test;

public class StringPalindromeTest {
    StringPalindrome stringPalindrome = new StringPalindrome();
    String palindrome = "ABCDE EDCBA";
    String notPalindrome = "Krzysztof";

    @Test
    public void testingPalindromeIterativeMethodIfTrue() {
        Assert.assertTrue(stringPalindrome.palindromeIterative(palindrome));
    }

    @Test
    public void testingPalindromeIterativeMethodIfFalse() {
        Assert.assertFalse(stringPalindrome.palindromeIterative(notPalindrome));
    }

    @Test
    public void testingPalindromeLibrariesMethodIfTrue() {
        Assert.assertTrue(stringPalindrome.palindromeWithLibraries(palindrome));
    }

    @Test
    public void testingPalindromeLibrariesMethodIfFalse() {
        Assert.assertFalse(stringPalindrome.palindromeWithLibraries(notPalindrome));
    }
}