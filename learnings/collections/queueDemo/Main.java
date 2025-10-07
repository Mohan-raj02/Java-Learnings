package learnings.collections.queueDemo;

import java.time.Period;
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

//         for(int x : arr){
//             System.out.println(x);
//         }

//        List<Integer> list2 = new ArrayList<>(list);
//        list2.add(12);
//
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(11);

//        list.addAll(list2);
        list2.addAll(list);


//      12,11,3,5,10,11
        List<Integer> list3 = list2.subList(1,4);  // from list2 from index 1 to 3 has printed.
        list3.set(0, 100);

//        ---------------------------------------------------------------------------------------------
//        Queue<Integer> it = new Oueue()<>; ❌ Not allowed
//        You must use a class that implements Queue, like:
//        -- LinkedList
//        -- PriorityQueue
//        -- ArrayDeque
//        ---------------------------------------------------------------------------------------------


//  FIFO queue or queue
//        queue methods -- offer(add), peek(current state), poll(remove)

//        Queue<Integer> q = new LinkedList<>();
//        q.offer(3);
//        q.offer(1);
//
//        System.out.println(q.peek());  // print first element that inserts  // prints 3
//
//        System.out.println(q.poll()); // remover the first element , because the queue has first in first out behaviour // removes 3
//
//        System.out.println(q.peek()); // print first element that inserts  // prints 1
//
//        System.out.println(q.isEmpty()); // isEmpty is not the method of queue, it's the method of collection framework.


//    Stack
//      Stack-methods -- push(add), pop(remove)

//        Stack<Integer> stack = new Stack<>();
//        stack.push(2);
//        stack.push(3);
//
//
//        while (!stack.isEmpty()){
//            System.out.println(stack.peek());
//            stack.pop();
//        }


//        Dequeue(double ended queue)
//              dequeue use all methods like poll, peek, offer

        Deque<Integer> dq = new ArrayDeque<>();

        dq.offerLast(3);
        dq.offerLast(5);
        System.out.println(dq);

//        System.out.println(dq.peek());
//        System.out.println(dq.poll());
//        System.out.println(dq.peek());

        System.out.println(dq.pollFirst());
//        System.out.println(dq.pollFirst());
        System.out.println(dq.peekFirst());
//        System.out.println(dq.peekLast());
        System.out.println(dq);
    }
}


