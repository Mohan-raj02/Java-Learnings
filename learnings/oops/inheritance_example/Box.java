package learnings.oops.inheritance_example;

public class Box {
   private double l;
    double b;
    double h;
//    double weight;\

    static void show() {
        System.out.println("Static method in Parent");
    }

    Box (){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    Box(double side) {

//        super();   //super = object class,  every class that create has the object class as a superclass/parentxlass

        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box old){   //
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }


    public void information(){
        System.out.println("Running the box");
    }
}
