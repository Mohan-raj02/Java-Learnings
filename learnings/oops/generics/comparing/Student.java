package learnings.oops.generics.comparing;

public class Student implements Comparable<Student>{
    int roll_no;
    float marks;

    public Student(int roll_no, float marks) {
        this.roll_no = roll_no;
        this.marks = marks;
    }

    //    @Override
    //    public int compareTo(Student o) {
    //        int diff = (int)(this.marks - o.marks);
    //
    //        if diff == 0 then both are equal
    //        if diff < 0 then o is bigger else o is smaller
    //        return diff;
    //    }

    @Override
    public int compareTo(Student o) {
        if(this.marks-o.marks>0){
            return 1;
        } else if (this.marks - o.marks<0) {
            return -1;
        }
    //        if diff == 0 then both are equal
    //        if diff < 0 then o is bigger else o is smaller
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", marks=" + marks +
                '}';
    }
}
