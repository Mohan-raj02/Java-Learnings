package learnings.oops.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Mohan = new Human(22, "Mohan");
//        Human twin = new Human(Mohan);

        // use clonable interface
        Human twin = (Human) Mohan.clone();
        System.out.println(twin.age + " " + twin.name);

        twin.arr[0] = 100;
        // before deep copy
//        System.out.println(Arrays.toString(twin.arr));       //[100, 3, 4, 5, 6]
//        System.out.println(Arrays.toString(Mohan.arr));      //[100, 3, 4, 5, 6]


        // after deep copy
        System.out.println(Arrays.toString(twin.arr));      //[100, 3, 4, 5, 6]
        System.out.println(Arrays.toString(Mohan.arr));    //[2, 3, 4, 5, 6]



    }
}
