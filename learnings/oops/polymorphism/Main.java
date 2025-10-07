package learnings.oops.polymorphism;

public class Main{
    public static void main(String[] args) {
        Shapes Shape = new Shapes();
//        Circle Circle = new Circle();
//        Square Square = new Square();
        Shapes Square = new Square();         // overrides the parent class shapes
        Shapes Circle =new Circle();

        Shape.area();
        Circle.area();
        Square.area();
    }
}


/*
Types of polymorphism:
 1. Compile time / Static polymorphism
    - achieved via method overloading.
    -- method overloading happens on compile time (means when javoc convers human code to byte code)
    - Method Overloading : same name but types, arguments like return types , ordering can be different
    - (eg: multiple constructors)

 2. Run time / Dynamic polymorphism
    - achieved by method overriding.
    -- method overriding happens on run time (means when jvm converts the byte code to machine code/binary code)
    - Method overriding : same name, types and argument but the different difeerent witu inherited
    -- method overriding possible only on inheritance


important notes need to know:-
Early Binding: (eg: when using final keyword)
--Final Keyword:
        --if final keyword is used then the method or variable used is cannot be overridden anywhere.
        --actually the ovverridden stuffs happens in run time but the final keyword about restrict ovverriden has done in compoile time itself.
        -- hence it is called early binding.

LATE Binding: (override method):
        -- also tghe actual method of method ovverriding which can done on run time is called late binding.
*/




/*
 * POLYMORPHISM IN JAVA - THEORETICAL NOTES
 *
 * Definition:
 * Polymorphism means "many forms" and is one of the core concepts in object-oriented
 * programming that allows objects to behave differently based on their specific class
 * while sharing a common interface. It enables a single interface to represent
 * different underlying forms or data types.
 *
 * Types of Polymorphism in Java:
 *
 * 1. COMPILE-TIME POLYMORPHISM (Static Polymorphism):
 *    - Method Overloading: Multiple methods with same name but different parameters
 *    - Constructor Overloading: Multiple constructors with different parameter lists
 *    - Resolved at compile time based on method signatures
 *
 * 2. RUNTIME POLYMORPHISM (Dynamic Polymorphism):
 *    - Method Overriding: Child class provides specific implementation of parent method
 *    - Uses inheritance and method overriding
 *    - Resolved at runtime through dynamic method dispatch
 *    - Requires inheritance relationship between classes
 *
 * Key Concepts:
 * - Late Binding: Method calls resolved at runtime, not compile time
 * - Dynamic Method Dispatch: JVM determines which method to call based on actual object type
 * - Upcasting: Reference variable of parent type can hold child class objects
 * - Virtual Method Invocation: Overridden methods called based on object type, not reference type
 *
 * Benefits:
 * - Code Reusability: Same interface for different implementations
 * - Flexibility: Easy to add new classes without modifying existing code
 * - Maintainability: Changes in implementation don't affect client code
 * - Extensibility: New functionality can be added through inheritance
 *
 * STEPS TO IMPLEMENT RUNTIME POLYMORPHISM:
 *
 * Step 1: Create a Parent Class
 *         - Define common methods that can be overridden
 *         - Use appropriate access modifiers (public, protected)
 *
 * Step 2: Create Child Classes
 *         - Extend the parent class using 'extends' keyword
 *         - Override parent methods using @Override annotation
 *         - Provide specific implementations for each child class
 *
 * Step 3: Use Parent Reference
 *         - Declare reference variables of parent type
 *         - Assign child class objects to parent references
 *         - This enables upcasting automatically
 *
 * Step 4: Call Methods
 *         - Call overridden methods through parent reference
 *         - JVM will invoke the child class implementation at runtime
 *         - Method resolution happens through dynamic method dispatch
 *
 * Step 5: Handle Type Checking (Optional)
 *         - Use 'instanceof' operator for type checking when needed
 *         - Perform downcasting only when necessary and safe
 *         - Use explicit casting when converting parent reference to child type
 *
 * STEPS TO IMPLEMENT COMPILE-TIME POLYMORPHISM:
 *
 * Step 1: Method Overloading
 *         - Create multiple methods with same name in same class
 *         - Vary the number, type, or order of parameters
 *         - Return type alone cannot differentiate overloaded methods
 *
 * Step 2: Constructor Overloading
 *         - Create multiple constructors with different parameter lists
 *         - Each constructor should initialize object differently
 *         - Use 'this()' to call other constructors if needed
 *
 * Important Rules:
 * - Overridden methods must have same signature as parent method
 * - Cannot override static, final, or private methods
 * - Access modifier of overridden method cannot be more restrictive
 * - Constructors and static methods cannot be overridden
 * - Method overloading requires different parameter lists
 *
 * Memory Considerations:
 * - Each object maintains reference to its class's method table
 * - Virtual method table (vtable) stores method addresses
 * - Runtime overhead for method resolution in dynamic polymorphism
 * - Compile-time polymorphism has no runtime overhead
 */
