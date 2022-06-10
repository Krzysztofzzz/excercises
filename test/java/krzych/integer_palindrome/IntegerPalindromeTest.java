package krzych.integer_palindrome;

import org.junit.Assert;
import org.junit.Test;

public class IntegerPalindromeTest {

    private IntegerPalindrome integerPalindrome = new IntegerPalindrome();

    @Test
    public void whenGivenIntegerIsPalindromeReturnTrue() {
        Assert.assertTrue(integerPalindrome.isIntegerPalindrome(0));
        Assert.assertTrue(integerPalindrome.isIntegerPalindrome(1));
        Assert.assertTrue(integerPalindrome.isIntegerPalindrome(11));
        Assert.assertTrue(integerPalindrome.isIntegerPalindrome(121));
        Assert.assertTrue(integerPalindrome.isIntegerPalindrome(123454321));
    }

    @Test
    public void whenGivenIntegerIsNotPalindromeReturnFalse() {
        Assert.assertFalse(integerPalindrome.isIntegerPalindrome(12));
        Assert.assertFalse(integerPalindrome.isIntegerPalindrome(122432));
        Assert.assertFalse(integerPalindrome.isIntegerPalindrome(5322));
    }
}