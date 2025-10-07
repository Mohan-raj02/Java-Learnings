package learnings.oops.inheritance;
//method over-ridding

public class WildAnimal {
    void sound(){
        System.out.println("some sound");
    }
}

class Peacock extends WildAnimal{
    @Override
    void sound(){
        System.out.println("peacock featers");
    }
}
