package learnings.oops.interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("I start my music");
    }

    @Override
    public void stop() {
        System.out.println("I stop my music");
    }
}
