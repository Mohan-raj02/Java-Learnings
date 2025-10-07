package learnings.oops.final_keyword;

public class Main{
    public static void main(String[] args) {

// 1. Final Variable
        FinalVariableExample s1 = new FinalVariableExample("i am mohan");
        s1.name = "Mohan";
        System.out.println(s1.name);
        s1.changeFinal();

//        s1.description = "i am not mohan";               //java: cannot assign a value to final variable description


//2. Final Method
        Parent p1 = new Parent();
            p1.showmessage();


//3. Final Class
        Vehicle v1 = new Vehicle();
//        Car c1 = new Car();
//        c1.displayType();                             // java: cannot inherit from final learnings.oops.final_keyword.Vehicle
//        v1.displayType();\



//4. final with Object Reference
        final Student s3 = new Student("Alice");

        System.out.println("Before change: " + s3.name);

    // ✅ We can change the internal state of object
            s3.name = "Bob";
            System.out.println("After change: " + s3.name);

    // ❌ But we cannot reassign s1 to another object
    // s3 = new Student("Charlie"); // ERROR

    }
}




//FINAL KEYWORD IN JAVA - THEORETICAL NOTES
//
//=== DEFINITION ===
//        - Non-access modifier used to prevent modification
//- Can be applied to variables, methods, and classes
//- Indicates that an entity cannot be changed or extended after initialization
//
//=== FINAL VARIABLES ===
//
//For Primitive Data Types:
//        - Value cannot be changed once assigned
//- Creates true constants (immutable values)
//- Must be initialized either at declaration or in constructor
//- Examples: final int, final double, final boolean
//
//For Non-Primitive Data Types (Objects):
//        - Reference cannot be changed to point to another object
//- Object's internal state/properties can still be modified
//        - Only the reference is immutable, not the object content
//- Cannot reassign to a different object instance
//
//=== FINAL METHODS ===
//        - Cannot be overridden by subclasses
//- Maintains consistent implementation across inheritance hierarchy
//- Ensures specific functionality remains unchanged
//- Used when method behavior must stay constant
//
//=== FINAL CLASSES ===
//        - Cannot be extended or inherited by other classes
//- Prevents subclassing entirely
//- Examples: String class, wrapper classes (Integer, Double, etc.)
//- Used for creating immutable or utility classes
//
//=== KEY CHARACTERISTICS ===
//        1. Immutability enforcement
//2. Prevents method overriding
//3. Prohibits class inheritance
//4. Compile-time constant optimization
//5. Thread safety enhancement
//6. Early binding for methods
//
//=== ADVANTAGES ===
//
//Performance Benefits:
//        - Compiler optimizations for final variables
//- Early binding for final methods (no dynamic dispatch)
//- Memory optimization for constant values
//- Faster method execution due to no override checking
//
//Security Enhancements:
//        - Prevents malicious code modification
//- Protects sensitive data from changes
//- Maintains API contract integrity
//- Reduces vulnerability to inheritance attacks
//
//Code Quality Improvements:
//        - Enhances code readability and maintainability
//- Makes developer intent explicit
//- Reduces debugging complexity
//- Provides compile-time error checking
//
//Thread Safety:
//        - Final variables are inherently thread-safe
//- No synchronization needed for final references
//- Prevents race conditions on constant values
//- Safe publication in concurrent environments
//
//Design Benefits:
//        - Promotes immutable object creation
//- Enforces design constraints
//- Simplifies inheritance hierarchies
//- Supports functional programming patterns
//
//=== INITIALIZATION RULES ===
//        - Final variables must be initialized before use
//- Can be initialized at declaration or in constructor
//- Blank final variables require constructor initialization
//- Static final variables need class-level initialization
//
//=== MEMORY IMPLICATIONS ===
//        - Final variables stored in constant pool when possible
//- Reduced memory overhead for repeated constant values
//- Compiler inlining optimizations
//- Better garbage collection performance for immutable objects
//
//=== BEST PRACTICES ===
//        1. Use final for constants and configuration values
//2. Apply to method parameters to prevent accidental modification
//3. Make classes final when inheritance is not intended
//4. Combine with private constructors for utility classes
//5. Use final for creating immutable data structures
//
//=== LIMITATIONS ===
//        - Cannot declare final variables inside methods for constants
//- Final reference variables can still have mutable object content
//- May increase code verbosity in some cases
//- Cannot be used with abstract methods or classes

//final with parameters
//
//Method parameters marked final cannot be reassigned inside the method.
//
//void display(final int num) {
//    // num = num + 1; ❌ not allowed
//    System.out.println(num);
//}

