package learnings.oops.abstract_class;

abstract public class Parent {            // parent should not be final, static,  only inside the parent can have final and static

    int age;

    final int value;


//    abstract void parent(){                             // constructor -- error creating constructor
//
//    }

    public Parent(int age) {                            // but you can create constructure like this
        this.age = age;
        value = 225;
    }

//    abstract Parent(); abstract constructor is not allowed

//    abstract static method also not allowed because the word abstract is meant for overridden where the static method cannot be overridden, so abstract static is not allowed.
//    but you can create static method in abstract class, only abstract static is not allowed which means using abstract keyword along with static.
//    the static method is fine to give with body of function inside abstract class

    static void hello(){
        System.out.println("hey");
    }

    void normal(){
        System.out.println("this is normal");
    }

    abstract void Career();  //any class that contains one or more abstract methods, must also be declared as abstract.
    abstract void Partner();
}
