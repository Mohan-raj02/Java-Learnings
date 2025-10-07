package learnings.concepts.Arrays;


import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        sum of arrays
        SumoFArrays arr = new SumoFArrays();
        int returnArray = arr.getSumoFArrays();
        System.out.println(returnArray);


//        largest number of array
        FIndLargestNumbers num = new FIndLargestNumbers();     //onj
        int largestNumber = num.getLargestNumber();   //method
        System.out.println(largestNumber);

//          largest number of array (in other method)
        LargestNumber ln = new LargestNumber(new int[]{5,10,6,2,2});
        int largest = ln.LargestNumber();
        System.out.println("largest number:"+largest);

//        reverse array
        ReverseArray reverse = new ReverseArray();
//        Array reverseArray = reverse.getReverseArray();
        int[] reverseArray = reverse.getReverseArray();
        System.out.println(Arrays.toString(reverseArray));


    }
}