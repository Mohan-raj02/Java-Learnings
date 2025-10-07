package learnings.concepts.Arrays;

import java.lang.reflect.Array;

public class SumoFArrays {
//    private Array arr;

    int[] arr = {5, 12, 9, 7, 25};
    int sum = 0;

    public int getSumoFArrays(){
        for (int i=0 ; i < arr.length ; i++){
            sum += sum + arr[i];
        }
        return sum;
    }
}
