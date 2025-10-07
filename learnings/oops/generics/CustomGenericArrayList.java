package learnings.oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<T> // 'T' is placeholder type which can rec\place with specified type by the compiler when the user calls
{

    private Object[] data;  // using object may allow the type of its child class too like the integer class inside object class, string class inside object class
    private static int DEFAUlT_SIZE = 10;
    private int size = 0; //initially its zero   // increase via size++


    public CustomGenericArrayList(){
        this.data = new Object[DEFAUlT_SIZE];   //new int[10]
        //increase the size of the array when the size is engaged

    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        //eg:  if num = 20
        data[size++] = num;  // data[0] = 20, then size++ --> data [1];       //post increment of size, which First use the current value of size as the index., Then increase size by 1 (post-increment).
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
//        copy the current items in the new array
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];               // both as object so no casting needed
        }
        data = temp;  // reassign to the bigger array
    }

    private boolean isFull() {
       return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);          // small type has bigger type so casting needed
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }


    //        --length : capacity of the backing array (how many items it can hold).
    //        --size : number of elements actually added to your array.
    public int size(){
        return size;
    }

    public int length(){
        return data.length;
    }

    public void set(int index, T value){
        data[index] = value;                     // bigger type has smaller type son no casting needed
    }

    @Override
    public String toString() {
        return "CustomGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericArrayList list = new CustomGenericArrayList();
//        list.add(3);
//        list.add(4);
//        list.add(9);

//        System.out.println(list);
//        for(int i=0 ; i< list.length(); i++){              // use i < 12 or somrthing more than 10 to check the extended length
//            list.add(i);
//        }
//        System.out.println();
//        System.out.println(list.length());


        ArrayList<Integer> list2 = new ArrayList<>();  // <Integer>(wrapper class) -- integer or something data type is called parameterised type, cannont offer primitive typr like 'int', 'long' ehrre the Interger is class not primitive
//        list2.size();

        CustomGenericArrayList<Integer> list3 = new CustomGenericArrayList<>();
//        list3.add(25);
//        list3.add("Mohan")    // error, because the generic gives as Integer not as String
        for (int i = 0; i < 14; i++) {
            list3.add(i);
        }
//        System.out.println(list3.length());
        System.out.println(list3);

//        CustomGenericArrayList<String> list4 = new CustomGenericArrayList<>();
//        list4.add("Mohan");
//        list4.add(25);  // error, because the generic gives as String not as Integer
    }
}




