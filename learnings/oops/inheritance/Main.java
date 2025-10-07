package learnings.oops.inheritance;

public class Main{
    public static void main(String[] args){
//        single inheritance
        Dog d1 = new Dog();
        d1.eat();
        d1.barks();

//        multi-level inheritance
        Puppy p1 = new Puppy();
        p1.eat();
        p1.barks();
        p1.weep();

//        Hierarchical Inheritance
        Bat b1 = new Bat();
        Ball b2 = new Ball();

        b1.hit();
        b1.play();

        b2.flies();
        b2.play();

//        method overriding
        WildAnimal a = new Peacock();
        a.sound();

        //    constructor inheritance
        Child c = new Child();
    }
}


/*
 * DYNAMIC DISPATCH (DYNAMIC METHOD DISPATCH) IN JAVA
 * ==================================================
 *
 * DEFINITION:
 * Dynamic dispatch is the process of selecting which implementation of a
 * polymorphic method to call at runtime rather than compile time. It is the
 * mechanism that enables runtime polymorphism in Java through method overriding.
 *
 * KEY CONCEPTS:
 * - Method selection happens at runtime based on actual object type
 * - Superclass reference can point to subclass objects (upcasting)
 * - JVM determines which overridden method version to execute
 * - Different from static dispatch where method is determined at compile time
 * - Essential for implementing runtime polymorphism in object-oriented programming
 *
 * HOW IT WORKS:
 * 1. Superclass reference variable is declared
 * 2. Reference can point to objects of subclass types
 * 3. When method is called through reference, JVM checks actual object type
 * 4. JVM selects appropriate overridden method implementation
 * 5. Method execution occurs based on object type, not reference type
 *
 * IMPLEMENTATION MECHANISM:
 * - Java uses Virtual Method Table (vtable) internally
 * - Each object contains pointer to its class vtable
 * - vtable maps method names to actual implementations
 * - Runtime lookup determines correct method to invoke
 * - Slight performance overhead due to runtime resolution
 *
 * REQUIREMENTS FOR DYNAMIC DISPATCH:
 * 1. Inheritance relationship between classes
 * 2. Method overriding in subclasses
 * 3. Superclass reference pointing to subclass object
 * 4. Non-static, non-final, non-private methods
 *
 * STEPS TO IMPLEMENT:
 * Step 1: Create superclass with method to be overridden
 * Step 2: Create subclasses extending the superclass
 * Step 3: Override the method in each subclass with specific implementation
 * Step 4: Declare superclass reference variable
 * Step 5: Assign subclass objects to superclass reference
 * Step 6: Call overridden method through superclass reference
 * Step 7: JVM automatically dispatches to correct implementation at runtime
 *
 * BENEFITS:
 * - Enables polymorphic behavior
 * - Code flexibility and extensibility
 * - Runtime decision making
 * - Support for object-oriented design principles
 *
 * CONSIDERATIONS:
 * - Small runtime performance cost due to method lookup
 * - Method must be non-static, non-final, non-private
 * - Only works with overridden methods, not overloaded methods
 * - Type of object (not reference) determines method selection
 */







/* INHERITANCE IN JAVA - THEORETICAL NOTES */

/*
 * DEFINITION:
 * Inheritance is a fundamental OOP concept where one class (child/subclass)
 * acquires properties and methods from another class (parent/superclass).
 * It enables code reusability and establishes IS-A relationships.
 */

/*
 * KEY CONCEPTS:
 * 1. Parent Class (Superclass): The class being inherited from
 * 2. Child Class (Subclass): The class that inherits from parent
 * 3. extends keyword: Used to establish inheritance relationship
 * 4. Method Override: Child class can provide specific implementation
 * 5. super keyword: References parent class members
 */

/*
 * TYPES OF INHERITANCE IN JAVA:
 * 1. Single Inheritance: One child inherits from one parent
 * 2. Multilevel Inheritance: Chain of inheritance (A->B->C)
 * 3. Hierarchical Inheritance: Multiple children from one parent
 * Note: Java doesn't support multiple inheritance for classes
 */

/*
 * STEPS TO IMPLEMENT INHERITANCE:
 *
 * Step 1: Create parent class with common attributes/methods
 * Step 2: Create child class using 'extends' keyword
 * Step 3: Child automatically inherits all public/protected members
 * Step 4: Override methods if specific behavior needed
 * Step 5: Use 'super()' to call parent constructor if required
 * Step 6: Create objects and test inheritance functionality
 */

/*
 * ACCESS MODIFIERS IN INHERITANCE:
 * - public: Inherited and accessible
 * - protected: Inherited and accessible within package/subclasses
 * - default: Inherited only within same package
 * - private: NOT inherited (not accessible in child)
 */

/*
 * CONSTRUCTOR INHERITANCE:
 * - Constructors are NOT inherited
 * - Child constructor must call parent constructor
 * - super() call must be first statement in child constructor
 * - If no explicit super() call, default parent constructor called
 */

/*
 * METHOD OVERRIDING RULES:
 * - Same method signature as parent
 * - Return type must be same or covariant
 * - Access modifier can't be more restrictive
 * - Can't override static, final, or private methods
 * - Use @Override annotation for clarity
 */

/*
 * BENEFITS OF INHERITANCE:
 * 1. Code Reusability: Avoid duplicating code
 * 2. Method Overriding: Runtime polymorphism
 * 3. Abstraction: Hide implementation details
 * 4. Maintainability: Changes in parent reflect in children
 */

/*
 * IMPORTANT NOTES:
 * - All classes in Java inherit from Object class by default
 * - Use composition over inheritance when possible
 * - Inheritance creates tight coupling between classes
 * - Test inheritance relationships thoroughly
 */
