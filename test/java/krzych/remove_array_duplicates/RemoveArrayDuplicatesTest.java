package krzych.remove_array_duplicates;

import org.junit.Assert;
import org.junit.Test;

public class RemoveArrayDuplicatesTest {

    RemoveArrayDuplicates removeArrayDuplicates = new RemoveArrayDuplicates();

    @Test
    public void whenArrayHasNoElementsReturnArrayWithoutElements() {
        Object[] testArray = {};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasOneIntegerReturnArrayWithOneInteger() {
        Object[] testArray = {1};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {1};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasOneCharacterReturnArrayWithOneCharacter() {
        Object[] testArray = {'a'};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {'a'};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasOneStringReturnArrayWithOneString() {
        Object[] testArray = {"a"};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {"a"};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasTwoDifferentIntegersReturnArrayWithTwoDifferentIntegers() {
        Object[] testArray = {1, 2};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {1, 2};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasTwoDifferentCharactersReturnArrayWithTwoDifferentCharacters() {
        Object[] testArray = {'a', 'b'};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {'a', 'b'};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasTwoDifferentStringsReturnArrayWithTwoDifferentStrings() {
        Object[] testArray = {"Alice", "has"};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {"Alice", "has"};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasMultipleSameIntegersReturnArrayWithOneInteger() {
        Object[] testArray = {1, 1, 1, 1, 1, 1, 1, 1};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {1};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasMultipleSameCharactersReturnArrayWithOneCharacter() {
        Object[] testArray = {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a',};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {'a'};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasMultipleSameStringsReturnArrayWithOneString() {
        Object[] testArray = {"Example", "Example", "Example", "Example", "Example", "Example", "Example"};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {"Example"};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasNoDuplicateIntegersReturnSameArray() {
        Object[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasNoDuplicateCharactersReturnSameArray() {
        Object[] testArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasNoDuplicateStringsReturnSameArray() {
        Object[] testArray = {"Alice", "has", "a", "cat"};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {"Alice", "has", "a", "cat"};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasDuplicateIntegersReturnArrayWithoutDuplicateIntegers() {
        Object[] testArray = {1, 2, 3, 4, 1, 5, 5, 6, 7, 1, 8, 8, 9, 10, 3, 10, 11, 12};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasDuplicateCharactersReturnArrayWithoutDuplicateCharacters() {
        Object[] testArray = {'a', 'a', 'b', 'c', 'c', 'c', 'd', 'e', 'e', 'f', 'f', 'g', 'g', 'g'};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasDuplicateStringsReturnArrayWithoutDuplicateStrings() {
        Object[] testArray = {"Alice", "Alice", "Alice", "has", "has", "has", "has", "has", "a", "cat", "cat", "cat"};
        Object[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        Object[] expectedArray = {"Alice", "has", "a", "cat"};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }
}