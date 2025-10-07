package learnings.concepts.Arrays;
// find largest number method --1
public class FIndLargestNumbers {

    int[] arr = {5, 12, 9, 7, 25};


//    int num = 0;
    int num = arr[0];   //best practise to start with index of array because if num is 0, it cause error if the array contains negative number

    public int getLargestNumber(){
        for (int i=0; i < arr.length; i++){
            int index = arr[i];
            if (num < index) {
                num = index;
            }
        }
        return num;
    }
}
