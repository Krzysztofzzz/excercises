package krzych.prime_number;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberTest {

    private PrimeNumber primeNumber = new PrimeNumber();

    @Test
    public void ifNumberIsPrimeReturnTrue() {
        Assert.assertTrue(primeNumber.isPrime(1));
        Assert.assertTrue(primeNumber.isPrime(2));
        Assert.assertTrue(primeNumber.isPrime(3));
        Assert.assertTrue(primeNumber.isPrime(5));
        Assert.assertTrue(primeNumber.isPrime(7));
        Assert.assertTrue(primeNumber.isPrime(11));
        Assert.assertTrue(primeNumber.isPrime(13));
        Assert.assertTrue(primeNumber.isPrime(17));
    }

    @Test
    public void ifNumberIsNotPrimeNumberReturnFalse() {
        Assert.assertFalse(primeNumber.isPrime(4));
        Assert.assertFalse(primeNumber.isPrime(6));
        Assert.assertFalse(primeNumber.isPrime(10));
        Assert.assertFalse(primeNumber.isPrime(25));
        Assert.assertFalse(primeNumber.isPrime(100));
        Assert.assertFalse(primeNumber.isPrime(27));
    }

    @Test
    public void ifNumberIsNegativeReturnFalse() {
        Assert.assertFalse(primeNumber.isPrime(-1414));
        Assert.assertFalse(primeNumber.isPrime(-1));
    }

    @Test
    public void ifNumberisZeroReturnFalse() {
        Assert.assertFalse(primeNumber.isPrime(0));
    }
}