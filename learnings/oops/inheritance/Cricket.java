package learnings.oops.inheritance;

//hierarchical inheritance
public class Cricket {
        void play(){
            System.out.println("plays cricket");
        }
    }
    class Bat extends Cricket{
        void hit(){
            System.out.println("bat hits ball");
        }
    }

    class Ball extends Cricket{
        void flies(){
            System.out.println("ball flies");
        }
    }
