package learnings.oops.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }

    // lambda style used WITHOUT Consumer (direct in forEach)
        arr.forEach((item) -> System.out.println(item + 1));  // 1 2 3 4 5


    // Lambda style used WITH Consumer purpose
        //consumer rule:  "take something in, do something with it, give nothing back".
        Consumer<Integer> fun = ( item) -> System.out.println(item * 2);  // 0 2 4 6 8
        arr.forEach(fun);


    //lambda way
        //  (int a, int b) -> a + b;


    // using interface using lambda style
    Operation sum = (a,b) -> a + b;           //  implements Operation
    Operation prod = (a, b) -> a * b;
    Operation sub = (a, b) -> a - b;

//        System.out.println("5 + 3 = " + sum.operation(5, 3));      // Output: 8
//        System.out.println("5 * 3 = " + prod.operation(5, 3)); // Output: 15
//        System.out.println("5 - 3 = " + sub.operation(5, 3));


        LambdaFunctions myCalculator = new LambdaFunctions();
//        myCalculator.operate(5, 3, sum);
        System.out.println("sum:"+myCalculator.operate(5,3, sum));

    }


    // normal way
//    public int sum(int a, int b){
//        return a + b;
//    }

    private int operate(int a, int b, Operation op){             // (5, 3, Operation sum)
        return op.operation(a,b);                              // return sum.operation(5,3)
    }


}

interface Operation{
    int operation(int a, int b);
//    int operation(int a, int b);          error
}



//------------------------//eample 1----------------------------------
//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//// Print each number doubled
//numbers.forEach(n -> System.out.println(n * 2));
//
//// Add 10 to each and print
//Consumer<Integer> addTenAndPrint = n -> System.out.println(n + 10);
//numbers.forEach(addTenAndPrint);

//-----------------------------------------------------------------------

//-------------------------------------------example 2----------------------------------------
//import java.util.*;
//        import java.util.function.Consumer;
//
//public class LambdaVsConsumerExample {
//    public static void main(String[] args) {
//        List<String> fruits = Arrays.asList("apple", "banana", "orange");
//
//        // Lambda style used WITH Consumer purpose
//        Consumer<String> printFruit = fruit -> System.out.println("I like " + fruit);
//        fruits.forEach(printFruit);
//
//        // Same lambda style used WITHOUT Consumer (direct in forEach)
//        fruits.forEach(fruit -> System.out.println("Yummy " + fruit));
//
//        // Lambda style used with OTHER purposes too
//        // With Predicate (returns true/false)
//        fruits.stream().filter(fruit -> fruit.startsWith("a")).forEach(System.out::println);
//    }
//}

//----------------------------------------------------------------------------------------------

//-----------------------------------------------example 3 ------------------------------------------

//eg:
//
//List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
//
//// Find names starting with 'A'
//List<String> aNames = names.stream()
//        .filter(name -> name.startsWith("A"))
//        .collect(Collectors.toList());

//----------------------------------------------------------------------------------------------------

//------------------------------------------------------example 4 ----------------------------------------
// Custom interface for math operations
//@FunctionalInterface  // This tells Java "this should have only 1 method"
//interface MathOperation {
//    int calculate(int a, int b);  // One method that takes 2 numbers, returns 1 number
//}
//
//public class CustomInterfaceExample {
//    public static void main(String[] args) {
//        // Create different math operations using lambda
//        MathOperation addition = (a, b) -> a + b;
//        MathOperation multiplication = (a, b) -> a * b;
//        MathOperation subtraction = (a, b) -> a - b;
//
//        // Use them
//        System.out.println("5 + 3 = " + addition.calculate(5, 3));      // Output: 8
//        System.out.println("5 * 3 = " + multiplication.calculate(5, 3)); // Output: 15
//        System.out.println("5 - 3 = " + subtraction.calculate(5, 3));   // Output: 2
//    }
//}

//-----------------------------------------------------------------------------------------------------------