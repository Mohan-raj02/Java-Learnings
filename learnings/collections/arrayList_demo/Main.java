package learnings.collections.arrayList_demo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[4];             // array to declare like this should the size of array '[4]', arraus always have a fixed size that you cannot change
//        array[0] = "Mohan";
//        array[1] = "Raj";

        //        create
        String[] array2 = {"Mohan", "akshaya", "thayyab"};   // in array you can hold primitive and non primitive data types like 'int', 'long', ''string

        ArrayList<String> ArreyList = new ArrayList<>();  // In array list it don't have fixed size

        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("Mohan", "akshaya", "thayyab"));   // does not allow primitive data types like 'int', 'long' ,may only allow object like 'string'.

        // Arrays.asList -- it actually give you immutable list thet you cannot change. where you cannot add or remove values inside it.
        // new ArrayList<>(Arrays.asList) -- it actually mutable (changeable)\

//        Get element
        System.out.println(array2[1]);
        System.out.println(array.length);

//        Get size
        System.out.println(arrayList2.get(2));
        System.out.println(arrayList2.size());  // size is not like length

//        --length : capacity of the backing array (how many items it can hold).
//        --size : number of elements actually added to your array.

//        add an element
        // you can't change or add values like that in arrays :(
//        array2[3] = "shrin";                     //fails
//        System.out.println(array2[3]);           //fails
        // but you can add values in array list

        arrayList2.add("Aarthy");
        System.out.println(arrayList2.get(3));
        System.out.println(arrayList2.size());

//        set an element
        array2[1] = "LR Akshaya";
        System.out.println(array2[1]);
        arrayList2.set(1, "LR Akshaya");
        System.out.println(arrayList2.get(1));

//        remove an element
        // you can't do with arrays :(
        //but you can with arrayList

        arrayList2.remove(1);
        System.out.println(arrayList2.get(1));

//        print
        System.out.println(Arrays.toString(array2));
        System.out.println(arrayList2);
    }



}
