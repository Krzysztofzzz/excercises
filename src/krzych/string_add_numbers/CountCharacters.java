package krzych.string_add_numbers;

public class CountCharacters {

    public String count(String input) {
        if (input == null || input.length() == 0)
            return input;
        char charToAdd = input.charAt(0);
        String output = "";
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != charToAdd) {
                output += String.valueOf(charToAdd) + count;
                count = 1;
                charToAdd = input.charAt(i);
            } else
                count++;
        }
        output += String.valueOf(charToAdd) + count;
        return output;
    }
}
