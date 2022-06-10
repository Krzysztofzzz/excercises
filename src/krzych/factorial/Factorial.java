package krzych.factorial;

public class Factorial {

    int factorialRecursive(int number) {
        if (number > 0)
            return number * factorialRecursive(number - 1);
        else return 1;
    }

    int factorialIterative(int number) {
        int factorial = 1;
        while (number > 0) {
            factorial *= number;
            number--;
        }
        return factorial;
    }
}
