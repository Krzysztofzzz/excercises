package krzych.prime_number;

public class PrimeNumber {

    boolean isPrime(int numberToCheck) {
        if (numberToCheck <= 0)
            return false;

        int halfNumberToCheck = numberToCheck / 2;

        for (int i = 2; i <= halfNumberToCheck; i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }
}
