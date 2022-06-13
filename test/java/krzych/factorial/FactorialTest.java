package krzych.factorial;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    private Factorial factorial = new Factorial();

    @Test
    public void checkRecursiveFactorial() {
        Assert.assertEquals(1, factorial.factorialRecursive(0));
        Assert.assertEquals(1, factorial.factorialRecursive(1));
        Assert.assertEquals(2, factorial.factorialRecursive(2));
        Assert.assertEquals(6, factorial.factorialRecursive(3));
        Assert.assertEquals(24, factorial.factorialRecursive(4));
        Assert.assertEquals(120, factorial.factorialRecursive(5));
        Assert.assertEquals(720, factorial.factorialRecursive(6));
    }

    @Test
    public void checkIterativeFactorial() {
        Assert.assertEquals(1, factorial.factorialIterative(0));
        Assert.assertEquals(1, factorial.factorialIterative(1));
        Assert.assertEquals(2, factorial.factorialIterative(2));
        Assert.assertEquals(6, factorial.factorialIterative(3));
        Assert.assertEquals(24, factorial.factorialIterative(4));
        Assert.assertEquals(120, factorial.factorialIterative(5));
        Assert.assertEquals(720, factorial.factorialIterative(6));
    }
}