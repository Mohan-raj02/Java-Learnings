package learnings.oops.static_example;
//static inner class
//static inner class can be accessed without creating an object of the class
//static inner class can't use non-static data members of the class
//static inner class can't call non-static methods of the class
public class InnerClasses {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
        Test a = new Test("Mohan");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}



