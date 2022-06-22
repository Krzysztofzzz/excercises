package krzych.string_add_numbers;

import org.junit.Assert;
import org.junit.Test;

public class CountCharactersTest {
    private final CountCharacters countCharacters = new CountCharacters();

    @Test
    public void returnNullWhenStringIsNull() {
        String input = null;
        String output = countCharacters.count(input);
        Assert.assertNull(output);
    }

    @Test
    public void returnEmptyStringWhenInputIsEmpty() {
        String input = "";
        String output = countCharacters.count(input);
        Assert.assertEquals(input, output);
    }

    @Test
    public void whenOneCharacterGivenReturnSameCharacterPlusNumber() {
        String input = "a";
        String output = countCharacters.count(input);
        String expected = "a1";
        Assert.assertEquals(expected, output);
    }

    @Test
    public void whenMultipleSameCharactersGivenReturnOneCharacterWithRepeatedNumber() {
        String input = "aaaaaa";
        String output = countCharacters.count(input);
        String expected = "a6";
        Assert.assertEquals(expected, output);
    }

    @Test
    public void whenMultipleDifferentCharactersAreGivenReturnProperCount() {
        String input = "aaaBBBdhhhhhh";
        String output = countCharacters.count(input);
        String expected = "a3B3d1h6";
        Assert.assertEquals(expected, output);
    }

    @Test
    public void whenTwoDifferentCharactersAreGivenReturnProperCount() {
        String input = "ab";
        String output = countCharacters.count(input);
        String expected = "a1b1";
        Assert.assertEquals(expected, output);
    }
}