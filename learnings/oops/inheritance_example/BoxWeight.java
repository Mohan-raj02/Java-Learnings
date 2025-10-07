package learnings.oops.inheritance_example;

public class BoxWeight extends Box{
    double weight;

//    @Override
    static void show() {
        System.out.println("Static method in Child");
    }

    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double side , double weight){
        super(side);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other){
        super(other);             // its eactle like -- Box <var name> = new BoxWeight(4,2,5,6);
        // it what Box old = other
        // super class variable can be used reference any object from that derived class

        weight = other.weight;
    }

    BoxWeight( double l, double h, double b,double weight ){
        super(l,b,h);  // super class call the parent class constructor
        // used to initialize values present in the parent class

//        System.out.println(super.weight);

        this.weight = weight;
    }
}


