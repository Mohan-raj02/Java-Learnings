package learnings.oops.inheritance;
//constructor inheritance
public class Parent {
    Parent(){
        System.out.println("cat meows");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("cow sleeps");
    }
}