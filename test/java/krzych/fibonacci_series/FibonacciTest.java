package krzych.fibonacci_series;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void whenLengthIsAPositiveNumberReturnFibonacciSeries() {
        try {
            int[] fibonacciArray = fibonacci.getFibonacci(10);
            int[] expectedArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
            Assert.assertArrayEquals(expectedArray, fibonacciArray);
        } catch (WrongNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test()
    public void whenLengthIsANegativeNumberThrowWrongNumberException() {
        try {
            int[] fibonacciArray = fibonacci.getFibonacci(-1);
        } catch (WrongNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void whenLengthIsZeroThrowWrongNumberException() {
        try {
            int[] fibonacciArray = fibonacci.getFibonacci(0);
            int[] expectedArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
            Assert.assertArrayEquals(expectedArray, fibonacciArray);
        } catch (WrongNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void whenLengthIsOneReturnZeroArray() {
        try {
            int[] fibonacciArray = fibonacci.getFibonacci(1);
            int[] expectedArray = {0};
            Assert.assertArrayEquals(expectedArray, fibonacciArray);
        } catch (WrongNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void whenLengthIsTwoReturnZeroAndOneArray() {
        try {
            int[] fibonacciArray = fibonacci.getFibonacci(2);
            int[] expectedArray = {0, 1};
            Assert.assertArrayEquals(expectedArray, fibonacciArray);
        } catch (WrongNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}