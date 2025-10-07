package learnings.oops.encapsulation;

public class StudentDemo {
    private int age;

//    setter
public void setAge(int age){
    if (age > 0 && age < 120) {
        this.age = age;  // only assign if valid
    } else {
        System.out.println("Invalid age");
    }
}
//    getter
    public int getAge(){
        return age;
    }
}
