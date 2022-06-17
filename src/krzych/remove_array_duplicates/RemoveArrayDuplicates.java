package krzych.remove_array_duplicates;

import java.util.Arrays;

public class RemoveArrayDuplicates {

    public Object[] removeDuplicates(Object[] arrayWithDuplicates) {
        if (arrayWithDuplicates.length == 0 || arrayWithDuplicates.length == 1)
            return arrayWithDuplicates;
        Object[] arrayWithoutDuplicates = new Object[]{};
        int position = 0;
        outerLoop:
        for (int i = 0; i < arrayWithDuplicates.length; i++) {
            for (int j = 0; j < arrayWithoutDuplicates.length; j++) {
                if (arrayWithoutDuplicates[j].equals(arrayWithDuplicates[i]))
                    continue outerLoop;
            }
            arrayWithoutDuplicates = addOneSlotToArray(arrayWithoutDuplicates);
            arrayWithoutDuplicates[position] = arrayWithDuplicates[i];
            position++;
        }
        System.out.println(Arrays.toString(arrayWithDuplicates));
        System.out.println(Arrays.toString(arrayWithoutDuplicates));
        return arrayWithoutDuplicates;
    }

    private Object[] addOneSlotToArray(Object[] arrayToExpand) {
        Object[] newArrayWithOneMoreSlot = new Object[arrayToExpand.length + 1];
        for (int i = 0; i < arrayToExpand.length; i++) {
            newArrayWithOneMoreSlot[i] = arrayToExpand[i];
        }
        return newArrayWithOneMoreSlot;
    }
}
