package learnings.oops.static_example;

//static method
//static method can be called without creating an object of the class
//static method can't use non-static data members of the class
//static method can't call non-static methods of the class


public class Main{
    public static void main(String[] args) {
//        Human Mohan = new Human(21, "Mohan", 15000, false);
//        Human Rahul = new Human(22, "Rahul", 30000, true);
//
//        System.out.println(Mohan.name);
//
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);


    }

//        this is not dependent on objects
//        static void fun(){   --non static connt be inside on static like , but the static can be inside the non-static
    ////            greetings();  //you can't use this because it requires an instance
//        //but the function you are using it in does not depend on instances
//        }
//    we know that something which is not static, belongs to an object
        void greetings(){
            System.out.println("Hello world");
        }
}


//important notes:
// -- the object will e created only during the run time,
// -- the overridden could be handle by object only on run time.
// -- the static which does not depend on object , so it will resolve during compile time.


/**
 * Topic: Static Block in Java
 *
 * 1. Definition:
 *    A static block is a block of code inside a class preceded by the `static` keyword.
 *    It runs once when the class is first loaded into the JVM, before any object is created
 *    or any static method is called.
 *
 * 2. Purpose:
 *    • Initialize static variables that require complex setup
 *    • Perform one-time configuration or resource loading for the class
 *    • Guarantee execution order for static initialization
 *
 * 3. Characteristics:
 *    • Executes exactly once, at class loading time
 *    • Can access only static members (variables and methods) of the class
 *    • Multiple static blocks allowed; executed in textual order
 *    • Executed before instance constructors and instance initializer blocks
 *
 * 4. Initialization Order:
 *    1) Static variable declarations with inline initializers
 *    2) Static blocks (in the order they appear)
 *    3) Instance variable initializers and instance init blocks (per object)
 *    4) Constructors (per object)
 *
 * 5. When to Use:
 *    • When static data requires exception handling during setup
 *    • When configuration must occur before any static method invocation
 *
 * 6. How to Implement a Static Block:
 *    Step 1: Declare static variables at class level (optional).
 *    Step 2: Write `static { }` block inside the class body.
 *    Step 3: Inside the block, initialize variables or perform setup logic.
 *    Step 4: Handle any checked exceptions using try/catch within the block.
 *    Step 5: Compile and load the class; verify that the block executes once.
 *
 * 7. Example Usage Steps (no code shown):
 *    – Identify data or resources needing one-time setup.
 *    – Place initialization logic into a static block.
 *    – Ensure error handling is present for resource access.
 *    – Access the class (e.g., call a static method) to trigger loading.
 *    – Observe that the static block runs before other class operations.
 */


/**
 * Topic: Static Methods in Java
 *
 * 1. Definition:
 *    A static method is a method declared with the `static` keyword.
 *    It belongs to the class itself rather than any instance, and can be
 *    invoked without creating an object of that class.
 *
 * 2. Purpose:
 *    • Provide utility or helper functionality related to the class
 *    • Share common behavior across all instances
 *    • Allow access without instantiating the class
 *
 * 3. Characteristics:
 *    • Can be called using ClassName.methodName()
 *    • Cannot access instance (non-static) fields or methods directly
 *    • Can access other static fields and methods of the class
 *    • Loaded and available as soon as the class is loaded
 *
 * 4. When to Use:
 *    • For operations that do not depend on instance state
 *    • For factory methods that return instances
 *    • For grouping related utility functions
 *
 * 5. How to Implement a Static Method:
 *    Step 1: Decide on the method’s purpose (utility vs. instance behavior).
 *    Step 2: Declare the method signature with `static` in its definition.
 *    Step 3: Ensure method logic uses only static or local variables.
 *    Step 4: Handle any exceptions inside the method body or declare them.
 *    Step 5: Compile the class and invoke via ClassName.methodName().
 *
 * 6. Example Steps (no code shown):
 *    – Identify functionality that doesn’t require object state.
 *    – Add method signature: `public static returnType methodName(...)`.
 *    – Write implementation using only parameters and static members.
 *    – Test by calling from main or another class without new instance.
 *    – Confirm behavior is consistent and thread-safe if needed.
 */
