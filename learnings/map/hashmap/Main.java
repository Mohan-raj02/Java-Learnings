package learnings.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Mohan", 39);
        students.put("Aarthy", 96);
        students.put("bharath", 51);
        students.put("Mohan", 69);     // keys used be unique must not be duplicate, but the value can be the same

        System.out.println(students);

        System.out.println(students.get("Aarthy"));    // get the value with key

        System.out.println(students.keySet());  // to get the key

        System.out.println(students.values());  // to get the values

        for(String student : students.keySet())
        {
            System.out.println(student + " : " + students.get(student));
        }

        System.out.println(students.remove("Mohan"));
        System.out.println(students);
    }
}
