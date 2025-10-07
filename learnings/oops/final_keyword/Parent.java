package learnings.oops.final_keyword;

public class Parent {
    public final void showmessage(){
        System.out.println("this is the parent method");
    }
}

class Child extends Parent{
//    public void showmessage(){                                          // ❌ Error if we try to override
//        System.out.println("this is the child method");
//    }
}
