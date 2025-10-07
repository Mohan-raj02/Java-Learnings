package learnings.oops.inheritance.superkeyword;
// Super Keyword to Call Parent Method

public class Parent {
    void display(){
        System.out.println("parent display");
    }
}
class Child extends Parent{
    void display(){
        super.display();                             // super keyword goes to parent class
        System.out.print("child display");
    }
}