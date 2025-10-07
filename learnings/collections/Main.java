package learnings.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // parent type        // object of type
//        List<Integer> list = new ArrayList<>();          // list is the parent class of the arraylist and linked list , so the list can also use the subclass with their methods
//        List<Integer> List2 = new LinkedList<>();
//
//        List2.add(2);
//        List2.add(51);
//        List2.add(116);
//        List2.add(331);
//
//        System.out.println(List2);

//        list.isEmpty();
//        list.add();


        // use array list instead using vector because array list is faster that vector because array list is multithreaded
        List<Integer> vector = new Vector<>();    // vector is synchronised (single threaded), where array list is non-synchronised (multithreaded)

        vector.add(2);
        vector.add(51);
        vector.add(116);
        vector.add(331);

        System.out.println(vector);

    }
}

//        Synchronous (synchronised)
//        Tasks happen one after another, in a sequence. A task must finish before the next one starts.
//        Asynchronous (asynchronised)
//        Tasks can happen independently or in parallel. One task doesn’t have to wait for another to finish