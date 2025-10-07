package learnings.concepts.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
//    int[] num = {12,5,6,7,9};
//
//    Demo(){
//        for(int getNum : num){
//            System.out.println(getNum);
//        }
//    }

//    -------------------------------------------------------------------------------------------------

    ArrayList<String> list = new ArrayList<>(Arrays.asList("Mohan", "Raj", "Aarthy"));

    ArrayList<String> getList(){
        return list;
    }

//    -----------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        Demo d = new Demo();
        ArrayList<String> list  = d.getList();

        for(String getNum : list){
            System.out.println(getNum);
        }
    }
}
