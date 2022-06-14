package krzych.remove_array_duplicates;

import java.util.Arrays;

public class RemoveArrayDuplicates {

    public int[] removeDuplicates(int[] arrayWithDuplicates) {
        if (arrayWithDuplicates.length == 0 || arrayWithDuplicates.length == 1)
            return arrayWithDuplicates;
        int[] arrayWithoutDuplicates = new int[]{};
        int checkedInt;
        int position = 0;
        outerLoop:
        for (int i = 0; i < arrayWithDuplicates.length; i++) {
            checkedInt = arrayWithDuplicates[i];
            for (int j = 0; j < arrayWithoutDuplicates.length; j++) {
                if (arrayWithoutDuplicates[j] == checkedInt)
                    continue outerLoop;
            }
            arrayWithoutDuplicates = addOneSlotToArray(arrayWithoutDuplicates);
            arrayWithoutDuplicates[position] = checkedInt;
            position++;
        }
        System.out.println(Arrays.toString(arrayWithDuplicates));
        System.out.println(Arrays.toString(arrayWithoutDuplicates));
        return arrayWithoutDuplicates;
    }

    private int[] addOneSlotToArray(int[] arrayToExpand) {
        int[] newArrayWithOneMoreSlot = new int[arrayToExpand.length + 1];
        for (int i = 0; i < arrayToExpand.length; i++) {
            newArrayWithOneMoreSlot[i] = arrayToExpand[i];
        }
        return newArrayWithOneMoreSlot;
    }
}
