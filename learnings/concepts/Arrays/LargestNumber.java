package learnings.concepts.Arrays;
// find largest number -- method 2
import java.util.Arrays;

public class LargestNumber {
    int[] arr;

    public LargestNumber(int[] arr){
        this.arr = arr;
        System.out.println(Arrays.toString(arr));
    }

    public int LargestNumber(){

        int num = arr[0];
        for(int i=0; i<arr.length; i++){
            if(num < arr[i]){
                num = arr[i];
            }
        }
        return num;
    }
}
