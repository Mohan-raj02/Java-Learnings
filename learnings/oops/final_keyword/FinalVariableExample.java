package learnings.oops.final_keyword;

public class FinalVariableExample {
    String name;
    final String description;

    FinalVariableExample(String description){
        this.description = description;
    }

    void changeFinal(){
//        description = "i am not mohan";                         //java: cannot assign a value to final variable description
        System.out.println("description: "+ description);
    }

}
