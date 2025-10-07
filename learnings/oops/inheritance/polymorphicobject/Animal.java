package learnings.oops.inheritance.polymorphicobject;
// Polymorphic Object

public class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
//    void speak(){}              // if there is no sound method in dog , first it checks with the similar method exists as parent class has, if not it pribnts for parent sound method if the child extends it
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
