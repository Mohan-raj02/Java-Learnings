package learnings.oops.garbage_collection;

public class A {
//    garbage collecting example  ---> example in main file
    String message;

    A(String message){
        this.message = message;
        System.out.println(message);
    }

//    @Override
//    protected void finalize() throws Throwable {      // finalize executes anyway
//        System.out.println("object is destroyed");
//    }
}
