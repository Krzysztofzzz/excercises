package krzych.fibonacci_series;

public class WrongNumberException extends Exception {
    public String getMessage() {
        return "Given number must be a positive number";
    }
}
