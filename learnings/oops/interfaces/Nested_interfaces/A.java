package learnings.oops.interfaces.Nested_interfaces;

public class A {
    //  nested interface
    public interface nestedInterfaces{
        boolean isOdd(int num);
    }
}

class B implements A.nestedInterfaces{
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

