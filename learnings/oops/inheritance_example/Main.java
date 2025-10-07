package learnings.oops.inheritance_example;

public class Main{
    public static void main(String[] args) {
//        single inheritance

//        Box b1 = new Box(2.5);
//        Box b2 = new Box(b1);
//        System.out.println(b1.l + " " + b1.b + " " + b1.h);

//        BoxWeight b3 = new BoxWeight();
//        BoxWeight b4 = new BoxWeight(5,4,3,2);
//        System.out.println( b4.h + " " + b4.weight);

//        Box b5 = new BoxWeight(5,4,3,2);
//        System.out.println(b5.b);

//        BoxWeight b6 = new BoxWeight(b3);
//        System.out.println("b6 weight:"+ b6.weight);

//        System.out.println(b5.weight);


//        there are many variables in both parent and child classes
//        you are given access to variables that are in the reference type i.e(BoxWeight)
//        hence , you should have access to weight variable
//        this also means, that the once you are trying to access should be initialized.
//        but here, when the object itself is of type parent class how will you call the constructor of chile class.
//        that is why error


//        BoxWeight b6 = new Box(5,4,3);
//        System.out.println(b5.b);


//        multi-level inheritance
        BoxPrice box = new BoxPrice(2,4, 5);
        System.out.println("side:" + box.h);

//        Box box = new BoxWeight();        //still prints parent class will not overridde static method
//        box.greething();     // line 41, 42 is coded for test static method does override on static concept
                               // static method cannot be override, because overriding depends on object, but the static does not depends on object hence the static does not ovverrde.
                               // you can inherrit but you cannot override.(inherrit in means can be write the same oin child class with same method name and body but can't use '@override'annotion which means override, thet show error when try to override of statis method) --> for clear example see notes.txt on static_examopple package



    }
}



//Constructors in Java
//
//A constructor runs only when you create an object with new.
//
//If you don’t explicitly call a parent constructor in the child’s constructor, Java will automatically insert super(); (a call to the parent’s no-arg constructor).
//Key Takeaway
//
//The no-arg Box() constructor isn’t called automatically every time.
//
//        It’s called only when:
//
//You explicitly do new Box(), OR
//
//A child constructor doesn’t call super(...) → then Java inserts super(); by default.
//
//If you don’t write any super(...) in a child constructor, Java automatically inserts a call to the parent’s no-argument constructor (super();) as the first statement.
//
//But it will not magically match arguments — Java only inserts super();, never super(x, y, z).





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
