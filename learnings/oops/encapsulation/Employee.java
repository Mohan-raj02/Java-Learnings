package learnings.oops.encapsulation;

public class Employee {
    private final String id ;

    Employee(String id){
        this.id = id;
    }

//    test for changing variable when final keyword exists
//    public void setId(String s){
//        id = s;
//    }


    public String getId(){
        return id;
    }
}
