package learnings.oops.inheritance;
//        single inheritance
public class Animal {
    void eat(){
        System.out.println("animals eats fleshes");
    }
}
class Dog extends Animal{
    void barks(){
        System.out.println("dog barks");
    }
}

//       Multi-level inheritance
class Puppy extends Dog{
    void weep(){
        System.out.print("puppy weeps");
    }
}