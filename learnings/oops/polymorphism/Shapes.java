package learnings.oops.polymorphism;

public class Shapes {
    void area(){
        System.out.println("I'm in the shapes");
    }

//    Early binding:
//    final void area(){    // if final keyword is used then it cannot be overridden
//        System.out.println("I'm in the shapes");
//    }
}


//using final over the parents will restrict the child class to extends from the parent where the final keyword used.
