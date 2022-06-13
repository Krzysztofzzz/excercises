package krzych.reversed_string;

import org.junit.Assert;
import org.junit.Test;

public class ReversedStringTest {

    @Test
    public void checkIfGivenStringReverses() {
        ReversedString reversedString = new ReversedString();
        String givenString = "ABCDEFGH";
        Assert.assertEquals("HGFEDCBA", reversedString.reverseString(givenString));
    }
}