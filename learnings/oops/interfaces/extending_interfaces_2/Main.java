package learnings.oops.interfaces.extending_interfaces_2;

public class Main implements A, B {
//    @Override
//    public void fun() {
//
//    }

    @Override
    public void greet() {
        System.out.println(
                12
        );
    }



    public static void main(String[] args) {
//        Main obj = new Main();
        A.greeting();
    }
}