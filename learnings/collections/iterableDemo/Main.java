package learnings.collections.iterableDemo;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        OurGenericList<Integer> List = new OurGenericList<>();
//        List.getOurGenericList(2);


        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(11);

         Integer [] arr = list.toArray(new Integer[0]);

         for(int x : arr){
             System.out.println(x);
         }

//        List<Integer> list2 = new ArrayList<>(list);
//        list2.add(12);
//
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(11);

//        list.addAll(list2);
        list2.addAll(list);

        System.out.println("index of :" + list.indexOf(10));
        System.out.println("last index of :" + list2.lastIndexOf(11));
//        System.out.println(list2);
//        System.out.println(list2);

//      12,11,3,5,10,11
        List<Integer> list3 = list2.subList(1,4);  // from list2 from index 1 to 3 has printed.
        list3.set(0, 100);
        System.out.println(list3);

        System.out.println(list2);


        List<Integer> lk = new LinkedList<>();    // Both ArrayList and LinkedList provide a ListIterator
        lk.add(2);
        lk.add(3);
        lk.add(4);

        ListIterator<Integer> iterator = lk.listIterator();

        System.out.println(iterator.next());                  //        next -- return arr[index ++];
        System.out.println(iterator.next());
        System.out.println(iterator.previous());                //        previous -- return arr[-- index];


//  This does not allows to loop, because iteration only allows for array, arrayList, hashset, and for which is part of Java’s Collections Framework(means implements Iterable<T>).
//  Array Behind the scenes, ArrayList, arrays already implements Iterable<T>.
//  That means Java knows how to “walk through” each element one by one.
//  So the for-each loop is allowed.

//  but OurGenericList is your own class which does not implements iterable
//  so, this for loop cause error
//  to overcome this it should be an array family (or) it should implements Iterable.

        //        for (int x : List);



//       -- Key Points:
//        Iterator interface is like Queue interface: you can’t instantiate it directly.          --Iterator<Integer> it = new Iterator<>(); // ❌ Not allowed
//        You either use a class that provides it (like ArrayList.iterator())
//        Or implement the interface yourself.


//        Iterator<Integer> iterator = List.iterator();                                         --// ✅ get an iterator from a List
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        for (int x : List){
//            System.out.println(x);
//        }

    }
}



/*
==================================================================================
ITERATOR EXPLAINED (Child-Friendly Analogy & Code Comments)
==================================================================================

1️⃣ Think of OurGenericList as a box of toys 🎁
   - You put toys (numbers) in with add(): .add(3), .add(5), .add(10)
   - The box now has 3 toys inside.

2️⃣ How do you look at toys one by one? 🤔
   - You need someone to point at each toy in the box.
   - That someone is called an Iterator.
   - Iterator starts at the beginning (index = 0) and moves to the next toy each time.

3️⃣ OurGenericListIterator - the little helper
   private class OurGenericListIterator implements Iterator<T> {
       private OurGenericList<T> list; // The toy box
       private int index = 0;           // Where inside the box we are pointing
   }
   - This helper knows:
       1. Which toy box to look at (list)
       2. Where inside the box it is pointing (index)

4️⃣ hasNext() → Is there another toy left? 🧸
   @Override
   public boolean hasNext() {
       return index < size;
   }
   - “If my finger (index) is still inside the box (less than the number of toys = size), then YES, there are more toys left.”
   - Otherwise → no more toys.

5️⃣ next() → Give me the next toy 🎲
   @Override
   public T next() {
       return list.arr[index++];
   }
   - Point to the current toy in the box.
   - Hand it to you.
   - Move the finger (index++) to the next toy for later.
   - Each call gives one toy and moves forward.

6️⃣ Two ways to use the iterator 🎯
   a) Manual way (using while)
      Iterator<Integer> iterator = List.iterator();
      while (iterator.hasNext()){
          System.out.println(iterator.next());
      }
      - hasNext(): Are there more toys?
      - next(): Give me the next toy.
      - Repeats until no toys left.

   b) Shortcut (using for-each)
      for (int x : List) {
          System.out.println(x);
      }
      - Java does all the iterator work behind the scenes:
          1. Calls iterator() to get the helper
          2. Calls hasNext() to check for more toys
          3. Calls next() to get each toy
      - That’s why for-each only works if your class implements Iterable<T> and provides an iterator.

7️⃣ Output for both ways:
   3
   5
   10

8️⃣ Child-level summary:
   - Iterator = A little helper that walks through your toy box
   - hasNext() = "Are there more toys?"
   - next() = "Give me the next toy."
   - for-each = Java doing all the work automatically

==================================================================================
EXPLAINING THIS SPECIFIC CONSTRUCTOR
----------------------------------------------------------------------------------
public OurGenericListIterator(OurGenericList<T> list){
    this.list = list;
}

- This is the constructor of the inner iterator class.
- When you write: return new OurGenericListIterator(this);
  - You are creating a new helper (iterator) and passing the **current list (toy box)** into it.
- `this.list = list;` → Stores the reference to the outer list inside the iterator.
  - Left `this.list` = the iterator's own field
  - Right `list` = the list passed to the constructor
- Without this, the iterator would not know **which list** to iterate over.
==================================================================================
*/
