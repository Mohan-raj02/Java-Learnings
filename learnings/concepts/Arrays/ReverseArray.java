package learnings.concepts.Arrays;

import java.lang.reflect.Array;

public class ReverseArray {
    int[] arr = {5, 12, 9, 7, 25};

    public int[] getReverseArray() {
        int[] reversed = new int[arr.length];  // new array to store reversed

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];  // copy elements in reverse order
        }
        return reversed;
    }
}
