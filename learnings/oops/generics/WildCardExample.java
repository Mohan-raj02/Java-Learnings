package learnings.oops.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//here T should either be number or its sub classes.
//Here the extends Number used to allows only from number class, number class is the class thet extends by Integer class.
public class WildCardExample<T extends Number>
{

    private Object[] data;
    private static int DEFAUlT_SIZE = 10;
    private int size = 0; //initially its zero   // increase via size++


    public WildCardExample(){
        this.data = new Object[DEFAUlT_SIZE];   //new int[10]
        //increase the size of the array when the size is engaged

    }

    public void getList(List<? extends Number> list){                  // if you put just List<T extends Number>, then it olly allow number type not the child of number like 'integer'
        //A List in Java is just a box that can hold many things in order.
        // Example: A List of toys → [Car, Doll, Ball].


        //do something
//        obj.getList(Arrays.asList(10, 20, 30));   // list of Integers
//        obj.getList(Arrays.asList(1.1, 2.2, 3.3)); // list of Doubles
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
        WildCardExample list = new WildCardExample();
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

        WildCardExample<Integer> list3 = new WildCardExample<>();
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


