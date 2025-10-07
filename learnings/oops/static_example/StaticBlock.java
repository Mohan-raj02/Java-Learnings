package learnings.oops.static_example;
//initiallisation of static variables


//Static BLock
//Static block is used to initialize the static data members of the class
//Static block is executed only once when class is loaded
//Static block is used to initialize static data members in the order they are declared

public class StaticBlock {

    static int a=4;
    static int b;

//    will only run once, when the first obj is create i.e. when the class is loaded for the first time
    static {
        System.out.println("i am in static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " "+StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " "+StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.b);
    }

}