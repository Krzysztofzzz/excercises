package krzych.remove_array_duplicates;

import org.junit.Assert;
import org.junit.Test;

public class RemoveArrayDuplicatesTest {

    RemoveArrayDuplicates removeArrayDuplicates = new RemoveArrayDuplicates();

    @Test
    public void whenArrayHasNoElementsReturnArrayWithoutElements() {
        int[] testArray = {};
        int[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        int[] expectedArray = {};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasOneElementReturnArrayWithOneElement() {
        int[] testArray = {1};
        int[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        int[] expectedArray = {1};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasTwoDifferentElementsReturnArrayWithTwoDifferentElements() {
        int[] testArray = {1, 2};
        int[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        int[] expectedArray = {1, 2};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasTwoSameElementReturnArrayWithOneElement() {
        int[] testArray = {1, 1};
        int[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        int[] expectedArray = {1};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasNoDuplicatesReturnSameArray() {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }

    @Test
    public void whenArrayHasDuplicatesReturnArrayWithoutDuplicates() {
        int[] testArray = {1, 2, 3, 4, 1, 5, 5, 6, 7, 1, 8, 8, 9, 10, 3, 10, 11, 12};
        int[] arrayWithoutDuplicates = removeArrayDuplicates.removeDuplicates(testArray);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Assert.assertArrayEquals(expectedArray, arrayWithoutDuplicates);
    }
}