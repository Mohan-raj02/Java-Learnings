package learnings.oops.interfaces.extending_interfaces_2;

public interface A {

    //    static interface methods should always have a body
    //  call via the interface name
    static void greeting(){
        System.out.println("hey i am static method");
    }

   default void fun(){
       System.out.println("I'm in A");
   }
}
