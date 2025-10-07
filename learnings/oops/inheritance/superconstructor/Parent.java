package learnings.oops.inheritance.superconstructor;
// Calling Parent Constructor using super

public class Parent {
    Parent(String name){
        System.out.println("parent name:" + name);
    }
}
class Child extends Parent{
    Child(String name){
        super(name);                             // super keyword goes to parent class
        System.out.println("child nmae:" + name);
    }
}
