package learnings.oops.abstract_class;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
//        this.age = age;
    }

    @Override
    void Career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void Partner() {
        System.out.println("I love Iron man");
    }
}
