package learnings.oops.singleton;

import learnings.oops.access_modifier.BankDetails;

public class Main{
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();


//        all three reference variables are pointing to just one object
    }
}