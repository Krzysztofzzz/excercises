package krzych.reversed_string;

public class ReversedString {

    public String reverseString(String stringToReverse) {
        int stringLength = stringToReverse.length();
        String newString = "";
        for (int i = 0; i < stringLength; i++) {
            newString += stringToReverse.charAt(stringLength - i - 1);
        }
        return newString;
    }
}
