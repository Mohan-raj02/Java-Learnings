package learnings.oops.constructors;

public class Student {
    int rlno;
    String name;
    float marks;

// Constructor Overloading (comes under polymorpjism)
//    Student() {
//        this.name = "Mohan raj";
//        this.rlno = 31;
//        this.marks = 82.5f;
//
//        System.out.println("this is my name:" + name);
//        System.out.println("this is my roll no:" + rlno);
//    }

    Student(String name, float marks, int roll){
        this.name = name;
        this.rlno = roll;
        this.marks = marks;
    }

    Student(Student other){
        this.name = other.name;
        this.rlno = other.rlno;
    }

    Student(){
        this ("default person", 100.0f, 13);
    }
}
