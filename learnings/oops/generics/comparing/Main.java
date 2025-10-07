package learnings.oops.generics.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student mohan = new Student(331, 8.2f);
        Student aarthy = new Student(116, 9.7f);


        System.out.println(mohan.compareTo(aarthy));
        if (mohan.compareTo(aarthy) <0){
            System.out.println(mohan.compareTo(aarthy));
            System.out.println("aarthy has more marks");
        }

        //either use array list or array to sort the marks from student
        // sort directly calls the compare to method from the student class




        //array list
//        ArrayList<Student> list = new ArrayList<>();
//        list.add(aarthy);
//        list.add(mohan);
//        System.out.println(list);
//        list.sort(null);
//        System.out.println(list);


        // array
        Student[] list = {aarthy,mohan};
        System.out.println(Arrays.toString(list) );

//        Arrays.sort(list);

        // or

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks-o2.marks);
//            }
//        });

        // or

        // lamda expression
        Arrays.sort(list, (o1, o2) -> (int)(o1.marks-o2.marks));
        System.out.println(Arrays.toString(list));
    }
}
