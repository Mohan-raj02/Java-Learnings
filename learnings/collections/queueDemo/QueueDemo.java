package learnings.collections.queueDemo;

import java.util.Iterator;

public class QueueDemo<T> implements Iterable<T> {  // Iterable is the interface that used to access iteration for the created class That means Java knows how to “walk through” each element one by one.
    private int size;
    private T[] arr;

    public QueueDemo(){
        size = 0;
        arr = (T[])new Object[100];  // casting small (integer) to object
    }

   public void add(T item){
       arr[size ++] = item;
   }

   public T getOurGenericList(int index){
        return arr[index];
   }


    @Override
    public Iterator<T> iterator() {           // We must need to override iterator whenever implements Iterable 1(may be for access iteration functionality)
        return new OurGenericListIterator(this);  // this : passing the current list (iterator)
    }

    private class OurGenericListIterator implements Iterator<T>{

        private QueueDemo<T> list;
        private int index = 0;

        public OurGenericListIterator(QueueDemo<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            System.out.println("has next called");
            return index < size;
        }

        @Override
        public T next() {
            System.out.println("next called");
            return list.arr[index ++];
        }
    }
}
