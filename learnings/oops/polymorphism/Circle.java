package learnings.oops.polymorphism;

public class Circle extends Shapes{

    // this will run when the obj of circle is created
    // hence it is overriding the parent annotation
    @Override //this is called annotation
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
