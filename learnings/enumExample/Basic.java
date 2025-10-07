package learnings.enumExample;

public class Basic {
    enum Week implements A{               // enum keyword is the overall type (like data type)
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // all the one are public, static amd final
        // since it is final you can't create child enums
        // type is Week

        Week(){
            System.out.println("Constructor called for "+ this);
        }

//        void display();       // abstract method without body are not allowed.

        @Override
        public void hello() {
            System.out.println("hello how are you");
        }
        //this is not public or protected, only private and default.
        //why? we don't want to create new objects
        //this is not the enum concept, thats why

        // internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Sunday;
        week.hello();

//        System.out.println(week);
//        System.out.println(week.ordinal());



//        for (Week day : Week.values()) {
//            System.out.println(day);
//        }


    }
}


// enum cannot be super class\
// enum cannot be extend any class
// enum can implement interface
// abstract or abstract method without body are not allowed.
// should the method with the body.