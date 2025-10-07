package learnings.oops.abstract_class;

public class Son extends Parent{              // you can extends parent abstract class

    public Son(int age) {
        super(age);
//        this.age = age;
    }



    @Override
    void normal() {
        super.normal();
    }

    @Override
    void Career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void Partner() {
        System.out.println("I love pepper potts");
    }
}
