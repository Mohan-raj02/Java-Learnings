package learnings.oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAUlT_SIZE = 10;
    private int size = 0; //initially its zero   // increase via size++


    public CustomArrayList(){
        this.data = new int[DEFAUlT_SIZE];   //new int[10]
        //increase the size of the array when the size is engaged

    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        //eg:  if num = 20
        data[size++] = num;  // data[0] = 20, then size++ --> data [1];       //post increment of size, which First use the current value of size as the index., Then increase size by 1 (post-increment).
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
//        copy the current items in the new array
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;  // reassign to the bigger array
    }

    private boolean isFull() {
       return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }


    //        --length : capacity of the backing array (how many items it can hold).
    //        --size : number of elements actually added to your array.
    public int size(){
        return size;
    }

    public int length(){
        return data.length;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(4);
//        list.add(9);
//
//        System.out.println(list);

        for(int i=0 ; i< list.length(); i++){              // use i < 12 or somrthing more than 10 to check the extended length
            list.add(i);
        }
//        System.out.println();
        System.out.println(list.length());


        ArrayList<Integer> list2 = new ArrayList<>();  // <Integer>(wrapper class) -- integer or something data type is called parameterised type, cannont offer primitive typr like 'int', 'long' ehrre the Interger is class not primitive
//        list2.add("Mohan");
//        List2.add(26);


//        using raw array list like below causes warning

//        ArrayList list = new ArrayList();
//        list.add(51);
//        list.set(0, 542);
//        list.get(0);
//        list.remove(0);
//        list.size();
    }
}

//In arraylist when the default capacity of it (eg: '10')to store elements is full then the new array list would created and all the existing elements copied to the new arraylist and then the new data added.
